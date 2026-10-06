package app.core ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class hextorgb extends GXProcedure
{
   public hextorgb( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( hextorgb.class ), "" );
   }

   public hextorgb( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public boolean executeUdp( String aP0 ,
                              String[] aP1 ,
                              GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 )
   {
      hextorgb.this.aP3 = new boolean[] {false};
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
      hextorgb.this.AV8Hex = aP0;
      hextorgb.this.aP1 = aP1;
      hextorgb.this.aP2 = aP2;
      hextorgb.this.AV22OK = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV22OK = true ;
      if ( GXutil.len( GXutil.trim( AV8Hex)) < 6 )
      {
         AV14Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
         AV14Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "HEX_01", "") );
         AV14Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Número hexadecimal incorrecto", "") );
         AV14Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
         AV15Messages.add(AV14Message, 0);
         AV22OK = false ;
      }
      if ( AV22OK )
      {
         AV25i = (short)((GXutil.len( GXutil.trim( AV8Hex))-6)+1) ;
         AV13HexStr = GXutil.substring( AV8Hex, AV25i, -1) ;
         AV12HexR = GXutil.substring( AV13HexStr, 1, 2) ;
         AV11HexG = GXutil.substring( AV13HexStr, 3, 2) ;
         AV9HexB = GXutil.substring( AV13HexStr, 5, 2) ;
         AV10HexEval = AV12HexR ;
         AV25i = (short)(1) ;
         /* Execute user subroutine: 'HEXEVAL' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV18Numero1 = AV17Numero ;
         AV25i = (short)(2) ;
         /* Execute user subroutine: 'HEXEVAL' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV19Numero2 = AV17Numero ;
         AV21NumR = (short)((AV18Numero1*16)+AV19Numero2) ;
         AV10HexEval = AV11HexG ;
         AV25i = (short)(1) ;
         /* Execute user subroutine: 'HEXEVAL' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV18Numero1 = AV17Numero ;
         AV25i = (short)(2) ;
         /* Execute user subroutine: 'HEXEVAL' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV19Numero2 = AV17Numero ;
         AV20NumG = (short)((AV18Numero1*16)+AV19Numero2) ;
         AV10HexEval = AV9HexB ;
         AV25i = (short)(1) ;
         /* Execute user subroutine: 'HEXEVAL' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV18Numero1 = AV17Numero ;
         AV25i = (short)(2) ;
         /* Execute user subroutine: 'HEXEVAL' */
         S111 ();
         if ( returnInSub )
         {
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV19Numero2 = AV17Numero ;
         AV16NumB = (short)((AV18Numero1*16)+AV19Numero2) ;
         if ( AV22OK )
         {
            AV23RGB = GXutil.format( "%1, %2, %3", GXutil.trim( GXutil.str( AV21NumR, 4, 0)), GXutil.trim( GXutil.str( AV20NumG, 4, 0)), GXutil.trim( GXutil.str( AV16NumB, 4, 0)), "", "", "", "", "", "") ;
         }
         else
         {
            AV23RGB = httpContext.getMessage( "ERROR", "") ;
         }
      }
      cleanup();
   }

   public void S111( )
   {
      /* 'HEXEVAL' Routine */
      returnInSub = false ;
      AV24Valor = GXutil.substring( GXutil.trim( AV10HexEval), AV25i, 1) ;
      AV17Numero = (short)(99) ;
      if ( ( GXutil.strcmp(AV24Valor, "0") >= 0 ) && ( GXutil.strcmp(AV24Valor, "9") <= 0 ) )
      {
         AV17Numero = (short)(GXutil.lval( AV24Valor)) ;
      }
      else
      {
         AV17Numero = (short)((GXutil.asc( GXutil.upper( AV24Valor))-55)) ;
         if ( ( AV17Numero >= 10 ) && ( AV17Numero <= 15 ) )
         {
         }
         else
         {
            AV14Message = (com.genexus.SdtMessages_Message)new com.genexus.SdtMessages_Message(remoteHandle, context);
            AV14Message.setgxTv_SdtMessages_Message_Id( httpContext.getMessage( "HEX_02", "") );
            AV14Message.setgxTv_SdtMessages_Message_Description( httpContext.getMessage( "Valor hexadecimal ", "")+AV24Valor+httpContext.getMessage( " es incorrecto.", "") );
            AV14Message.setgxTv_SdtMessages_Message_Type( (byte)(1) );
            AV15Messages.add(AV14Message, 0);
            AV22OK = false ;
         }
      }
   }

   protected void cleanup( )
   {
      this.aP1[0] = hextorgb.this.AV23RGB;
      this.aP2[0] = hextorgb.this.AV15Messages;
      this.aP3[0] = hextorgb.this.AV22OK;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV23RGB = "" ;
      AV15Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV14Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV13HexStr = "" ;
      AV12HexR = "" ;
      AV11HexG = "" ;
      AV9HexB = "" ;
      AV10HexEval = "" ;
      AV24Valor = "" ;
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV25i ;
   private short AV18Numero1 ;
   private short AV17Numero ;
   private short AV19Numero2 ;
   private short AV21NumR ;
   private short AV20NumG ;
   private short AV16NumB ;
   private short Gx_err ;
   private String AV12HexR ;
   private String AV11HexG ;
   private String AV9HexB ;
   private String AV24Valor ;
   private boolean AV22OK ;
   private boolean returnInSub ;
   private String AV8Hex ;
   private String AV23RGB ;
   private String AV13HexStr ;
   private String AV10HexEval ;
   private boolean[] aP3 ;
   private String[] aP1 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message>[] aP2 ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV15Messages ;
   private com.genexus.SdtMessages_Message AV14Message ;
}

