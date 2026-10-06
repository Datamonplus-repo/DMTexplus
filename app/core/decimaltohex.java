package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class decimaltohex extends GXProcedure
{
   public decimaltohex( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( decimaltohex.class ), "" );
   }

   public decimaltohex( int remoteHandle ,
                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( long aP0 ,
                              String[] aP1 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      decimaltohex.this.aP3 = new boolean[] {false};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( long aP0 ,
                        String[] aP1 ,
                        GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ,
                        boolean[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( long aP0 ,
                             String[] aP1 ,
                             GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ,
                             boolean[] aP3 )
   {
      decimaltohex.this.AV9Decimal = aP0;
      decimaltohex.this.aP1 = aP1;
      decimaltohex.this.aP2 = aP2;
      decimaltohex.this.AV16OK = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV16OK = true ;
      AV15Numero = DecimalUtil.doubleToDec(AV9Decimal) ;
      AV13Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "INFO-01", "") );
      AV13Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "El valor recido en &Decimal ", "")+GXutil.str( AV9Decimal, 10, 0)+httpContext.getMessage( " asigando a &Numero ", "")+GXutil.str( AV15Numero, 18, 8) );
      AV13Message.setgxTv_SdtMessages_Message_Type( (byte)(2) );
      AV14Messages.add(AV13Message, 0);
      while ( true )
      {
         gxexitloop = false ;
         if ( gxexitloop )
         {
            break;
         }
         AV15Numero = AV15Numero.divide(DecimalUtil.doubleToDec(16), 18, java.math.RoundingMode.DOWN) ;
         AV10Decimales = AV15Numero.subtract(DecimalUtil.doubleToDec(GXutil.Int( DecimalUtil.decToDouble(AV15Numero)))) ;
         AV12HexNum = (short)(DecimalUtil.decToDouble((AV10Decimales.multiply(DecimalUtil.doubleToDec(16))))) ;
         if ( ( GXutil.Int( AV12HexNum) >= 0 ) && ( GXutil.Int( AV12HexNum) <= 9 ) )
         {
            AV11Hex = GXutil.trim( GXutil.str( GXutil.Int( AV12HexNum), 10, 0)) + AV11Hex ;
         }
         else if ( ( GXutil.Int( AV12HexNum) >= 10 ) && ( GXutil.Int( AV12HexNum) <= 15 ) )
         {
            AV8AscII = (short)(GXutil.Int( AV12HexNum)+55) ;
            AV11Hex = GXutil.chr( AV8AscII) + AV11Hex ;
         }
         else
         {
            AV11Hex = httpContext.getMessage( "ERROR", "") ;
            AV13Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "DEC-01", "") );
            AV13Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "El valor ", "")+GXutil.str( AV9Decimal, 10, 0)+httpContext.getMessage( " no puede ser convertido a hexadecimal ", "")+GXutil.str( AV10Decimales, 18, 8)+" "+GXutil.str( AV12HexNum, 4, 0) );
            AV13Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
            AV14Messages.add(AV13Message, 0);
            AV16OK = false ;
            if (true) break;
         }
         if ( GXutil.Int( DecimalUtil.decToDouble(AV15Numero)) == 0 )
         {
            if (true) break;
         }
      }
      AV11Hex = GXutil.padl( GXutil.trim( AV11Hex), (short)(6), "0") ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = decimaltohex.this.AV11Hex;
      this.aP2[0] = decimaltohex.this.AV14Messages;
      this.aP3[0] = decimaltohex.this.AV16OK;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Hex = "" ;
      AV14Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV15Numero = DecimalUtil.ZERO ;
      AV13Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV10Decimales = DecimalUtil.ZERO ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV12HexNum ;
   private short AV8AscII ;
   private short Gx_err ;
   private long AV9Decimal ;
   private java.math.BigDecimal AV15Numero ;
   private java.math.BigDecimal AV10Decimales ;
   private boolean AV16OK ;
   private boolean gxexitloop ;
   private String AV11Hex ;
   private com.genexus.SdtMessages_Message AV13Message ;
   private boolean[] aP3 ;
   private String[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV14Messages ;
}

