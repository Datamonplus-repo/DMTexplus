package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class rgbtobgr extends GXProcedure
{
   public rgbtobgr( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( rgbtobgr.class ), "" );
   }

   public rgbtobgr( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String[] aP1 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      rgbtobgr.this.aP3 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ,
                             boolean[] aP3 )
   {
      rgbtobgr.this.AV16RGB = aP0;
      rgbtobgr.this.aP1 = aP1;
      rgbtobgr.this.aP2 = aP2;
      rgbtobgr.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Col_RGB = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV16RGB,"(,){1,}")) ;
      AV12Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV12Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "RGB_01", "") );
      AV12Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "RGBToDecimal &RGB.json ", "")+AV9Col_RGB.toJSonString(false) );
      AV12Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
      AV13Messages.add(AV12Message, 0);
      AV14OK = true ;
      if ( AV9Col_RGB.size() != 3 )
      {
         AV12Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV12Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "RGB_01", "") );
         AV12Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "RGB incorrecto", "") );
         AV12Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV13Messages.add(AV12Message, 0);
         AV14OK = false ;
      }
      if ( AV14OK )
      {
         AV18i = (short)(1) ;
         while ( AV18i <= 3 )
         {
            if ( ( CommonUtil.decimalVal( (String)AV9Col_RGB.elementAt(-1+AV18i), ".").doubleValue() < 0 ) || ( CommonUtil.decimalVal( (String)AV9Col_RGB.elementAt(-1+AV18i), ".").doubleValue() > 255 ) )
            {
               AV12Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
               AV12Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "RGB_02", "") );
               AV12Message.setgxTv_SdtMessages_Message_Description( GXutil.format( httpContext.getMessage( "RGB %1 esta fuera de rango", ""), GXutil.trim( (String)AV9Col_RGB.elementAt(-1+AV18i)), "", "", "", "", "", "", "", "") );
               AV12Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
               AV13Messages.add(AV12Message, 0);
               AV14OK = false ;
            }
            AV18i = (short)(AV18i+1) ;
         }
      }
      if ( AV14OK )
      {
         AV8B = (short)(GXutil.lval( (String)AV9Col_RGB.elementAt(-1+1))) ;
         AV11G = (short)(GXutil.lval( (String)AV9Col_RGB.elementAt(-1+2))) ;
         AV15R = (short)(GXutil.lval( (String)AV9Col_RGB.elementAt(-1+3))) ;
         AV17BGR = GXutil.format( "%1,%2,,%3", GXutil.str( AV8B, 3, 0), GXutil.str( AV11G, 3, 0), GXutil.str( AV15R, 3, 0), "", "", "", "", "", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = rgbtobgr.this.AV17BGR;
      this.aP2[0] = rgbtobgr.this.AV13Messages;
      this.aP3[0] = rgbtobgr.this.AV14OK;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV17BGR = "" ;
      AV13Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV9Col_RGB = new GXSimpleCollection<String>(String.class, "internal", "");
      AV12Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV18i ;
   private short AV8B ;
   private short AV11G ;
   private short AV15R ;
   private short Gx_err ;
   private boolean AV14OK ;
   private String AV16RGB ;
   private String AV17BGR ;
   private boolean[] aP3 ;
   private String[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private GXSimpleCollection<String> AV9Col_RGB ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV13Messages ;
   private com.genexus.SdtMessages_Message AV12Message ;
}

