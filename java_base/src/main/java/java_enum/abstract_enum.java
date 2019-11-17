package java_enum;

public enum abstract_enum {
	SPRING {
		@Override
		public String show() {
			return "春季";
		}
	},
	SUMMER {
		@Override
		public String show() {
			return "夏季";
		}
	},
	AUTUMN {
		@Override
		public String show() {
			return "秋季";
		}
	},
	WINTER {
		@Override
		public String show() {
			return "冬季";
		}
	};
	public abstract String show();
}
