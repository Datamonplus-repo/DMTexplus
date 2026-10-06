package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hextodecimal extends GXProcedure
{
   public hextodecimal( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hextodecimal.class ), "" );
   }

   public hextodecimal( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              long[] aP1 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      hextodecimal.this.aP3 = new boolean[] {false};
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
      hextodecimal.this.AV14Hex = aP0;
      hextodecimal.this.aP1 = aP1;
      hextodecimal.this.aP2 = aP2;
      hextodecimal.this.AV26OK = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV26OK = true ;
      AV16i = (short)((GXutil.len( GXutil.trim( AV14Hex))-6)+1) ;
      AV31HexStr = GXutil.substring( AV14Hex, AV16i, -1) ;
      if ( GXutil.len( GXutil.trim( AV31HexStr)) != 6 )
      {
         AV17Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV17Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "HEX_01", "") );
         AV17Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Número hexadecimal incorrecto", "") );
         AV17Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV18Messages.add(AV17Message, 0);
         AV26OK = false ;
         AV13Decimal = -1 ;
      }
      if ( AV26OK )
      {
         AV13Decimal = 0 ;
         AV30Potencia = (short)(0) ;
         AV16i = (short)(GXutil.len( GXutil.trim( AV31HexStr))) ;
         while ( AV16i >= 1 )
         {
            AV29Caracter = GXutil.substring( GXutil.trim( AV31HexStr), AV16i, 1) ;
            if ( ( GXutil.strcmp(AV29Caracter, "0") >= 0 ) && ( GXutil.strcmp(AV29Caracter, "9") <= 0 ) )
            {
               AV13Decimal = (long)(AV13Decimal+(GXutil.Int( DecimalUtil.decToDouble(CommonUtil.decimalVal( AV29Caracter, ".")))*(java.lang.Math.pow(16,AV30Potencia)))) ;
            }
            else
            {
               AV19Numero = (short)((GXutil.asc( GXutil.upper( AV29Caracter))-55)) ;
               if ( ( AV19Numero >= 10 ) && ( AV19Numero <= 15 ) )
               {
                  AV13Decimal = (long)(AV13Decimal+(AV19Numero*(java.lang.Math.pow(16,AV30Potencia)))) ;
               }
               else
               {
                  AV17Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
                  AV17Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "HEX_02", "") );
                  AV17Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Valor hexadecimal ", "")+AV29Caracter+httpContext.getMessage( " incorrecto.", "") );
                  AV17Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
                  AV18Messages.add(AV17Message, 0);
                  AV26OK = false ;
                  AV13Decimal = -1 ;
                  if (true) break;
               }
            }
            AV30Potencia = (short)(AV30Potencia+1) ;
            AV16i = (short)(AV16i+-1) ;
         }
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = hextodecimal.this.AV13Decimal;
      this.aP2[0] = hextodecimal.this.AV18Messages;
      this.aP3[0] = hextodecimal.this.AV26OK;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV18Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV31HexStr = "" ;
      AV17Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV29Caracter = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV16i ;
   private short AV30Potencia ;
   private short AV19Numero ;
   private short Gx_err ;
   private long AV13Decimal ;
   private String AV29Caracter ;
   private boolean AV26OK ;
   private String AV14Hex ;
   private String AV31HexStr ;
   private boolean[] aP3 ;
   private long[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV18Messages ;
   private com.genexus.SdtMessages_Message AV17Message ;
}

