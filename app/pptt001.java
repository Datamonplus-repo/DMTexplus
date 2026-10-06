package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pptt001 extends GXProcedure
{
   public pptt001( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pptt001.class ), "" );
   }

   public pptt001( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String[] executeUdp( String[] aP0 ,
                               java.util.Date[] aP1 ,
                               java.util.Date[] aP2 )
   {
      AV31Tab_mq = new String[100] ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV31Tab_mq[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      execute_int(aP0, aP1, aP2, AV31Tab_mq);
      return AV31Tab_mq;
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 ,
                        java.util.Date[] aP2 ,
                        String[] AV31Tab_mq )
   {
      execute_int(aP0, aP1, aP2, AV31Tab_mq);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 ,
                             java.util.Date[] aP2 ,
                             String[] AV31Tab_mq )
   {
      pptt001.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pptt001.this.AV28Fec1 = aP1[0];
      this.aP1 = aP1;
      pptt001.this.AV29Fec2 = aP2[0];
      this.aP2 = aP2;
      pptt001.this.AV31Tab_mq = AV31Tab_mq;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_char1 = AV35ContDsc ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = httpContext.getMessage( "PTT001", "") ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      pptt001.this.A396EmprCod = GXv_char2[0] ;
      pptt001.this.GXt_char1 = GXv_char4[0] ;
      AV35ContDsc = GXt_char1 ;
      AV45Fascod = GXutil.substring( AV35ContDsc, 1, 8) ;
      AV30i = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV31Tab_mq[GX_I-1] = " " ;
         GX_I = (int)(GX_I+1) ;
      }
      /* Using cursor P04SS2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV28Fec1, AV29Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A130BarCodPar = P04SS2_A130BarCodPar[0] ;
         A132BarCodReo = P04SS2_A132BarCodReo[0] ;
         A129BarCod = P04SS2_A129BarCod[0] ;
         A213BarSit = P04SS2_A213BarSit[0] ;
         A159BarFecGen = P04SS2_A159BarFecGen[0] ;
         A180BarMaqCod = P04SS2_A180BarMaqCod[0] ;
         GXv_int5[0] = AV37HayReceta ;
         new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int5) ;
         pptt001.this.AV37HayReceta = GXv_int5[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int5[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_int7[0] = AV38Barfasest ;
         GXv_date8[0] = AV39BarFecrini ;
         GXv_char2[0] = AV40Maqcodbis ;
         new app.pplat07(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int5, GXv_char3, GXv_int7, GXv_date8, GXv_char2) ;
         pptt001.this.A396EmprCod = GXv_char4[0] ;
         pptt001.this.A129BarCod = GXv_int6[0] ;
         pptt001.this.A132BarCodReo = GXv_int5[0] ;
         pptt001.this.A130BarCodPar = GXv_char3[0] ;
         pptt001.this.AV38Barfasest = GXv_int7[0] ;
         pptt001.this.AV39BarFecrini = GXv_date8[0] ;
         pptt001.this.AV40Maqcodbis = GXv_char2[0] ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int6[0] = A129BarCod ;
         GXv_int7[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_char2[0] = AV42Hisprodti ;
         GXv_char9[0] = AV43Hisprodtf ;
         new app.pcp0000(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_char3, GXv_char2, GXv_char9) ;
         pptt001.this.A396EmprCod = GXv_char4[0] ;
         pptt001.this.A129BarCod = GXv_int6[0] ;
         pptt001.this.A132BarCodReo = GXv_int7[0] ;
         pptt001.this.A130BarCodPar = GXv_char3[0] ;
         pptt001.this.AV42Hisprodti = GXv_char2[0] ;
         pptt001.this.AV43Hisprodtf = GXv_char9[0] ;
         AV41Ok = httpContext.getMessage( "S", "") ;
         if ( ( AV37HayReceta == 1 ) && ( AV38Barfasest > 1 ) )
         {
            AV41Ok = httpContext.getMessage( "N", "") ;
         }
         AV44OkFase = (byte)(0) ;
         /* Using cursor P04SS3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, AV45Fascod});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A153BarFasEst = P04SS3_A153BarFasEst[0] ;
            A457FasCod = P04SS3_A457FasCod[0] ;
            A758ProCod = P04SS3_A758ProCod[0] ;
            A194BarOrdLin = P04SS3_A194BarOrdLin[0] ;
            AV44OkFase = (byte)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( ( GXutil.strcmp(AV41Ok, httpContext.getMessage( "S", "")) == 0 ) && ( AV44OkFase == 1 ) )
         {
            Gx_msg = httpContext.getMessage( "Procesando Tabla BARCAD... ", "") + GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
            System.out.println( Gx_msg );
            AV32BarMaqcod = A180BarMaqCod ;
            /* Execute user subroutine: 'TABLA1' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'TABLA1' Routine */
      returnInSub = false ;
      AV33q = (short)(1) ;
      AV34Crear_mq = (byte)(1) ;
      while ( AV33q <= 100 )
      {
         if ( GXutil.strcmp(AV31Tab_mq[AV33q-1], AV32BarMaqcod) == 0 )
         {
            AV34Crear_mq = (byte)(0) ;
            if (true) break;
         }
         AV33q = (short)(AV33q+1) ;
      }
      if ( AV34Crear_mq == 1 )
      {
         Gx_msg = httpContext.getMessage( "Actuaizando Hdr en Maquina ", "") + AV32BarMaqcod ;
         System.out.println( Gx_msg );
         AV31Tab_mq[AV30i-1] = AV32BarMaqcod ;
         AV30i = (short)(AV30i+1) ;
      }
   }

   protected void cleanup( )
   {
      this.aP0[0] = pptt001.this.A396EmprCod;
      this.aP1[0] = pptt001.this.AV28Fec1;
      this.aP2[0] = pptt001.this.AV29Fec2;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV35ContDsc = "" ;
      GXt_char1 = "" ;
      AV45Fascod = "" ;
      scmdbuf = "" ;
      P04SS2_A396EmprCod = new String[] {""} ;
      P04SS2_A130BarCodPar = new String[] {""} ;
      P04SS2_A132BarCodReo = new byte[1] ;
      P04SS2_A129BarCod = new int[1] ;
      P04SS2_A213BarSit = new byte[1] ;
      P04SS2_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      P04SS2_A180BarMaqCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A159BarFecGen = GXutil.nullDate() ;
      A180BarMaqCod = "" ;
      GXv_int5 = new byte[1] ;
      AV39BarFecrini = GXutil.nullDate() ;
      GXv_date8 = new java.util.Date[1] ;
      AV40Maqcodbis = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char3 = new String[1] ;
      AV42Hisprodti = "" ;
      GXv_char2 = new String[1] ;
      AV43Hisprodtf = "" ;
      GXv_char9 = new String[1] ;
      AV41Ok = "" ;
      P04SS3_A396EmprCod = new String[] {""} ;
      P04SS3_A129BarCod = new int[1] ;
      P04SS3_A132BarCodReo = new byte[1] ;
      P04SS3_A130BarCodPar = new String[] {""} ;
      P04SS3_A153BarFasEst = new byte[1] ;
      P04SS3_A457FasCod = new String[] {""} ;
      P04SS3_A758ProCod = new String[] {""} ;
      P04SS3_A194BarOrdLin = new short[1] ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      Gx_msg = "" ;
      AV32BarMaqcod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pptt001__default(),
         new Object[] {
             new Object[] {
            P04SS2_A396EmprCod, P04SS2_A130BarCodPar, P04SS2_A132BarCodReo, P04SS2_A129BarCod, P04SS2_A213BarSit, P04SS2_A159BarFecGen, P04SS2_A180BarMaqCod
            }
            , new Object[] {
            P04SS3_A396EmprCod, P04SS3_A129BarCod, P04SS3_A132BarCodReo, P04SS3_A130BarCodPar, P04SS3_A153BarFasEst, P04SS3_A457FasCod, P04SS3_A758ProCod, P04SS3_A194BarOrdLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte AV37HayReceta ;
   private byte GXv_int5[] ;
   private byte AV38Barfasest ;
   private byte GXv_int7[] ;
   private byte AV44OkFase ;
   private byte A153BarFasEst ;
   private byte AV34Crear_mq ;
   private short AV30i ;
   private short A194BarOrdLin ;
   private short AV33q ;
   private short Gx_err ;
   private int GX_I ;
   private int A129BarCod ;
   private int GXv_int6[] ;
   private String A396EmprCod ;
   private String AV35ContDsc ;
   private String GXt_char1 ;
   private String AV45Fascod ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A180BarMaqCod ;
   private String AV40Maqcodbis ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String AV42Hisprodti ;
   private String GXv_char2[] ;
   private String AV43Hisprodtf ;
   private String GXv_char9[] ;
   private String AV41Ok ;
   private String A457FasCod ;
   private String A758ProCod ;
   private String Gx_msg ;
   private String AV32BarMaqcod ;
   private java.util.Date AV28Fec1 ;
   private java.util.Date AV29Fec2 ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date AV39BarFecrini ;
   private java.util.Date GXv_date8[] ;
   private boolean returnInSub ;
   private String[] AV31Tab_mq ;
   private String[] aP0 ;
   private java.util.Date[] aP1 ;
   private java.util.Date[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P04SS2_A396EmprCod ;
   private String[] P04SS2_A130BarCodPar ;
   private byte[] P04SS2_A132BarCodReo ;
   private int[] P04SS2_A129BarCod ;
   private byte[] P04SS2_A213BarSit ;
   private java.util.Date[] P04SS2_A159BarFecGen ;
   private String[] P04SS2_A180BarMaqCod ;
   private String[] P04SS3_A396EmprCod ;
   private int[] P04SS3_A129BarCod ;
   private byte[] P04SS3_A132BarCodReo ;
   private String[] P04SS3_A130BarCodPar ;
   private byte[] P04SS3_A153BarFasEst ;
   private String[] P04SS3_A457FasCod ;
   private String[] P04SS3_A758ProCod ;
   private short[] P04SS3_A194BarOrdLin ;
}

final  class pptt001__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P04SS2", "SELECT EmprCod, BarCodPar, BarCodReo, BarCod, BarSit, BarFecGen, BarMaqCod FROM TXPBARCAD WHERE (EmprCod = ?) AND (BarFecGen >= ?) AND (BarFecGen <= ?) AND (BarSit <= 4) ORDER BY EmprCod, BarMaqCod, BarFecGen, BarSit ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P04SS3", "SELECT * FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarFasEst, FasCod, ProCod, BarOrdLin FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (FasCod = ?) AND (BarFasEst = 0) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setDate(3, (java.util.Date)parms[2]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

