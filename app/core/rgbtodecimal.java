package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rgbtodecimal extends GXProcedure
{
   public rgbtodecimal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rgbtodecimal.class ), "" );
   }

   public rgbtodecimal( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              long[] aP1 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      rgbtodecimal.this.aP3 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        long[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             long[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ,
                             boolean[] aP3 )
   {
      rgbtodecimal.this.AV14RGB = aP0;
      rgbtodecimal.this.aP1 = aP1;
      rgbtodecimal.this.aP2 = aP2;
      rgbtodecimal.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15Col_RGB = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV14RGB,"(,){1,}")) ;
      AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV16Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "RGB_01", "") );
      AV16Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "RGBToDecimal &RGB.json ", "")+AV15Col_RGB.toJSonString(false) );
      AV16Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
      AV11Messages.add(AV16Message, 0);
      AV12OK = true ;
      if ( AV15Col_RGB.size() != 3 )
      {
         AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV16Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "RGB_01", "") );
         AV16Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "RGB incorrecto", "") );
         AV16Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV11Messages.add(AV16Message, 0);
         AV12OK = false ;
      }
      if ( AV12OK )
      {
         AV17i = (short)(1) ;
         while ( AV17i <= 3 )
         {
            if ( ( CommonUtil.decimalVal( (String)AV15Col_RGB.elementAt(-1+AV17i), ".").doubleValue() < 0 ) || ( CommonUtil.decimalVal( (String)AV15Col_RGB.elementAt(-1+AV17i), ".").doubleValue() > 255 ) )
            {
               AV16Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
               AV16Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "RGB_02", "") );
               AV16Message.setgxTv_SdtMessages_Message_Description( GXutil.format( httpContext.getMessage( "RGB %1 esta fuera de rango", ""), GXutil.trim( (String)AV15Col_RGB.elementAt(-1+AV17i)), "", "", "", "", "", "", "", "") );
               AV16Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
               AV11Messages.add(AV16Message, 0);
               AV12OK = false ;
            }
            AV17i = (short)(AV17i+1) ;
         }
      }
      if ( AV12OK )
      {
         AV13R = (short)(GXutil.lval( (String)AV15Col_RGB.elementAt(-1+1))) ;
         AV10G = (short)(GXutil.lval( (String)AV15Col_RGB.elementAt(-1+2))) ;
         AV8B = (short)(GXutil.lval( (String)AV15Col_RGB.elementAt(-1+3))) ;
         AV9Decimal = (long)(AV13R+(AV10G*256)+(AV8B*256*256)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = rgbtodecimal.this.AV9Decimal;
      this.aP2[0] = rgbtodecimal.this.AV11Messages;
      this.aP3[0] = rgbtodecimal.this.AV12OK;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV15Col_RGB = new GXSimpleCollection<String>(String.class, "internal", "");
      AV16Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV17i ;
   private short AV13R ;
   private short AV10G ;
   private short AV8B ;
   private short Gx_err ;
   private long AV9Decimal ;
   private boolean AV12OK ;
   private String AV14RGB ;
   private boolean[] aP3 ;
   private long[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private GXSimpleCollection<String> AV15Col_RGB ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV11Messages ;
   private com.genexus.SdtMessages_Message AV16Message ;
}

