package io.github.PheonixVX.WorldNameExtender.mixins;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.world.CreateWorldScreen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CreateWorldScreen.class)
abstract class MixinCreateWorldScreen extends Screen {
	@Shadow
	private TextFieldWidget levelNameField;

	private CreateWorldScreen instance = (CreateWorldScreen) (Object) this;

	/*
		Dummy constructor
	 */
	protected MixinCreateWorldScreen (Text title) {
		super(title);
	}

	@Inject(method = "init", at = @At("TAIL"))
	private void initMixin (CallbackInfo ci) {
		this.levelNameField.setMaxLength(Integer.MAX_VALUE);
	}
}
