package app ;
import com.genexus.*;

public final  class StructSdtEmails_TOItem implements Cloneable, java.io.Serializable
{
   public StructSdtEmails_TOItem( )
   {
      this( -1, new ModelContext( StructSdtEmails_TOItem.class ));
   }

   public StructSdtEmails_TOItem( int remoteHandle ,
                                  ModelContext context )
   {
      gxTv_SdtEmails_TOItem_Email = "" ;
      gxTv_SdtEmails_TOItem_Name = "" ;
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

   public String getEmail( )
   {
      return gxTv_SdtEmails_TOItem_Email ;
   }

   public void setEmail( String value )
   {
      gxTv_SdtEmails_TOItem_N = (byte)(0) ;
      gxTv_SdtEmails_TOItem_Email = value ;
   }

   public String getName( )
   {
      return gxTv_SdtEmails_TOItem_Name ;
   }

   public void setName( String value )
   {
      gxTv_SdtEmails_TOItem_N = (byte)(0) ;
      gxTv_SdtEmails_TOItem_Name = value ;
   }

   protected byte gxTv_SdtEmails_TOItem_N ;
   protected String gxTv_SdtEmails_TOItem_Email ;
   protected String gxTv_SdtEmails_TOItem_Name ;
}

