package app.trabajosexternos ;
import com.genexus.*;

public final  class StructSdtFilterTrabajoExterno_Header_TRNWW implements Cloneable, java.io.Serializable
{
   public StructSdtFilterTrabajoExterno_Header_TRNWW( )
   {
      this( -1, new ModelContext( StructSdtFilterTrabajoExterno_Header_TRNWW.class ));
   }

   public StructSdtFilterTrabajoExterno_Header_TRNWW( int remoteHandle ,
                                                      ModelContext context )
   {
      java.util.Calendar cal = java.util.Calendar.getInstance();
      cal.set(1, 0, 1, 0, 0, 0);
      cal.set(java.util.Calendar.MILLISECOND, 0);
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts = "" ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec = cal.getTime() ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto = cal.getTime() ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N = (byte)(1) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N = (byte)(1) ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public int getSalextalb( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb ;
   }

   public void setSalextalb( int value )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb = value ;
   }

   public String getSalsts( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts ;
   }

   public void setSalsts( String value )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts = value ;
   }

   public short getMancod( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod ;
   }

   public void setMancod( short value )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod = value ;
   }

   public java.util.Date getSalextfec( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec ;
   }

   public void setSalextfec( java.util.Date value )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec = value ;
   }

   public java.util.Date getSalextfecto( )
   {
      return gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto ;
   }

   public void setSalextfecto( java.util.Date value )
   {
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N = (byte)(0) ;
      gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto = value ;
   }

   protected byte gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec_N ;
   protected byte gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto_N ;
   protected byte gxTv_SdtFilterTrabajoExterno_Header_TRNWW_N ;
   protected short gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Mancod ;
   protected int gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextalb ;
   protected String gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salsts ;
   protected java.util.Date gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfec ;
   protected java.util.Date gxTv_SdtFilterTrabajoExterno_Header_TRNWW_Salextfecto ;
}

