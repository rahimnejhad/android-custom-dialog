# android-custom-dialog
android custom dialog with onclicklistener

>usage :

```
final CustomDialogClass mCustomDialogClass = new CustomDialogClass(getActivity(), new CustomDialogClass.MyOnClickListener() {
	@Override
	public void onClick(int mId, Dialog dialog) {
		switch (mId) {
			case R.id.btn_yes:
			
				dialog.dismiss();
				break;

			case R.id.btn_no:
				Crop.pickImage(getContext(), Fragment_Home_Profile.this);
				dialog.dismiss();
				break;
			case R.id.btn_man:
				Toast.makeText(getContext(), "mohammad", Toast.LENGTH_SHORT).show();
				dialog.dismiss();
				break;
			default:
				break;
		}
	}
});

mCustomDialogClass.show();
```
