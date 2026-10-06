package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ficheroprep extends GXProcedure
{
   public ficheroprep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ficheroprep.class ), "" );
   }

   public ficheroprep( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 )
   {
      ficheroprep.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        byte[] aP3 ,
                        String[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             byte[] aP3 ,
                             String[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 )
   {
      ficheroprep.this.AV81EmprCod = aP0[0];
      this.aP0 = aP0;
      ficheroprep.this.AV100Dirp = aP1[0];
      this.aP1 = aP1;
      ficheroprep.this.AV101Barcod = aP2[0];
      this.aP2 = aP2;
      ficheroprep.this.AV102Barcodreo = aP3[0];
      this.aP3 = aP3;
      ficheroprep.this.AV103Barcodpar = aP4[0];
      this.aP4 = aP4;
      ficheroprep.this.AV104Reclinmaq = aP5[0];
      this.aP5 = aP5;
      ficheroprep.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV123ErrorMessage = "" ;
      AV99Dir = AV100Dirp ;
      AV99Dir = GXutil.trim( AV99Dir) ;
      AV57LenVar = (byte)(GXutil.len( AV99Dir)) ;
      AV99Dir = ((GXutil.strcmp(GXutil.substring( AV99Dir, AV57LenVar, 1), "\\")!=0) ? AV99Dir+"\\" : AV99Dir) ;
      AV100Dirp = GXutil.trim( AV99Dir) ;
      GXt_int1 = AV98Contval ;
      GXv_int2[0] = GXt_int1 ;
      new app.pnumdoc(remoteHandle, context).execute( AV81EmprCod, httpContext.getMessage( "SEDOCV", ""), GXv_int2) ;
      ficheroprep.this.GXt_int1 = GXv_int2[0] ;
      AV98Contval = GXt_int1 ;
      GXt_int3 = AV112ActOF9 ;
      GXv_int4[0] = GXt_int3 ;
      new app.pexicon(remoteHandle, context).execute( AV81EmprCod, httpContext.getMessage( "OF9SED", ""), GXv_int4) ;
      ficheroprep.this.GXt_int3 = GXv_int4[0] ;
      AV112ActOF9 = GXt_int3 ;
      /* Using cursor P09B92 */
      pr_default.execute(0, new Object[] {AV81EmprCod, Integer.valueOf(AV101Barcod), Byte.valueOf(AV102Barcodreo), AV103Barcodpar, Short.valueOf(AV104Reclinmaq)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A2804RecLinMaq = P09B92_A2804RecLinMaq[0] ;
         A130BarCodPar = P09B92_A130BarCodPar[0] ;
         A132BarCodReo = P09B92_A132BarCodReo[0] ;
         A129BarCod = P09B92_A129BarCod[0] ;
         A396EmprCod = P09B92_A396EmprCod[0] ;
         A616MaqOrdSeq = P09B92_A616MaqOrdSeq[0] ;
         n616MaqOrdSeq = P09B92_n616MaqOrdSeq[0] ;
         A602MaqCod = P09B92_A602MaqCod[0] ;
         A5109RecNumInt = P09B92_A5109RecNumInt[0] ;
         A616MaqOrdSeq = P09B92_A616MaqOrdSeq[0] ;
         n616MaqOrdSeq = P09B92_n616MaqOrdSeq[0] ;
         AV35Num_mq = A616MaqOrdSeq ;
         AV35Num_mq = (short)(GXutil.lval( GXutil.substring( A602MaqCod, 5, 2))) ;
         AV38Of6 = A5109RecNumInt ;
         AV111Of9 = GXutil.trim( GXutil.str( A129BarCod, 8, 0)) + GXutil.str( A132BarCodReo, 1, 0) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      /* Using cursor P09B93 */
      pr_default.execute(1, new Object[] {AV81EmprCod, Integer.valueOf(AV101Barcod), Byte.valueOf(AV102Barcodreo), AV103Barcodpar, Short.valueOf(AV104Reclinmaq)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A872RecPrdNum = P09B93_A872RecPrdNum[0] ;
         A2804RecLinMaq = P09B93_A2804RecLinMaq[0] ;
         A130BarCodPar = P09B93_A130BarCodPar[0] ;
         A132BarCodReo = P09B93_A132BarCodReo[0] ;
         A129BarCod = P09B93_A129BarCod[0] ;
         A396EmprCod = P09B93_A396EmprCod[0] ;
         A686PrdCant = P09B93_A686PrdCant[0] ;
         A811RecLin = P09B93_A811RecLin[0] ;
         A1273RecLinPro = P09B93_A1273RecLinPro[0] ;
         if ( A686PrdCant.doubleValue() < 1 )
         {
            AV120MoAColorantes = httpContext.getMessage( "M", "") ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
      AV119Inicio = GXutil.now( ) ;
      AV118Fin = GXutil.dtadd( AV119Inicio, AV113VarSleep) ;
      while ( AV118Fin.after( GXutil.now( ) ) )
      {
         AV119Inicio = GXutil.now( ) ;
         Gx_msg = "-> " + httpContext.getMessage( "Inicio= ", "") + localUtil.ttoc( AV119Inicio, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + httpContext.getMessage( " Espero...para inciar fichero PREP... ", "") + GXutil.newLine( ) ;
         Gx_msg += "-> " + httpContext.getMessage( "Fin= ", "") + localUtil.ttoc( AV118Fin, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") + GXutil.newLine( ) ;
         System.out.println( Gx_msg );
      }
      AV34FicA = GXutil.padl( GXutil.trim( GXutil.str( AV98Contval, 8, 0)), (short)(8), "0") ;
      AV12File = AV100Dirp ;
      AV122Filename = AV12File + AV34FicA + ".dat" ;
      AV121TextFile.setSource( AV122Filename );
      AV121TextFile.create();
      AV121TextFile.openWrite("");
      AV105LastRecForNro = (byte)(0) ;
      /* Using cursor P09B94 */
      pr_default.execute(2, new Object[] {AV81EmprCod, Integer.valueOf(AV101Barcod), Byte.valueOf(AV102Barcodreo), AV103Barcodpar, Short.valueOf(AV104Reclinmaq)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A719PrdNum = P09B94_A719PrdNum[0] ;
         n719PrdNum = P09B94_n719PrdNum[0] ;
         A2394RecForNro = P09B94_A2394RecForNro[0] ;
         A2804RecLinMaq = P09B94_A2804RecLinMaq[0] ;
         A130BarCodPar = P09B94_A130BarCodPar[0] ;
         A132BarCodReo = P09B94_A132BarCodReo[0] ;
         A129BarCod = P09B94_A129BarCod[0] ;
         A396EmprCod = P09B94_A396EmprCod[0] ;
         A5109RecNumInt = P09B94_A5109RecNumInt[0] ;
         A811RecLin = P09B94_A811RecLin[0] ;
         A1273RecLinPro = P09B94_A1273RecLinPro[0] ;
         A5109RecNumInt = P09B94_A5109RecNumInt[0] ;
         if ( AV105LastRecForNro != A2394RecForNro )
         {
            AV125TextFileLine = httpContext.getMessage( "\"PREP\"", "") + "," ;
            AV125TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( AV35Num_mq, 4, 0)), (short)(4), "0") + "\"" + "," ;
            if ( AV112ActOF9 == 0 )
            {
               AV125TextFileLine += "\"" + GXutil.padr( GXutil.trim( GXutil.str( A5109RecNumInt, 8, 0)), 8, " ") + "\"" + "," ;
            }
            else
            {
               AV125TextFileLine += "\"" + GXutil.padr( GXutil.trim( AV111Of9), 9, " ") + "\"" + "," ;
            }
            AV125TextFileLine += "\"" + GXutil.padl( GXutil.trim( GXutil.str( A2394RecForNro, 2, 0)), (short)(2), "0") + "\"" + "," ;
            AV125TextFileLine += "\"" + "01" + "\"" + "," ;
            AV125TextFileLine += "\"" + "2" + "\"" ;
            if ( GXutil.len( AV125TextFileLine) > 0 )
            {
               AV121TextFile.writeLine(AV125TextFileLine);
            }
         }
         AV105LastRecForNro = A2394RecForNro ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV121TextFile.close();
      if ( AV121TextFile.getErrCode() != 0 )
      {
         AV123ErrorMessage = GXutil.trim( GXutil.str( AV121TextFile.getErrCode(), 10, 2)) + " " + GXutil.trim( AV121TextFile.getErrDescription()) ;
      }
      else
      {
         AV123ErrorMessage += httpContext.getMessage( "Fichero PREP ,Productos creado", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ficheroprep.this.AV81EmprCod;
      this.aP1[0] = ficheroprep.this.AV100Dirp;
      this.aP2[0] = ficheroprep.this.AV101Barcod;
      this.aP3[0] = ficheroprep.this.AV102Barcodreo;
      this.aP4[0] = ficheroprep.this.AV103Barcodpar;
      this.aP5[0] = ficheroprep.this.AV104Reclinmaq;
      this.aP6[0] = ficheroprep.this.AV123ErrorMessage;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV123ErrorMessage = "" ;
      AV99Dir = "" ;
      GXv_int2 = new int[1] ;
      GXv_int4 = new byte[1] ;
      scmdbuf = "" ;
      P09B92_A2804RecLinMaq = new short[1] ;
      P09B92_A130BarCodPar = new String[] {""} ;
      P09B92_A132BarCodReo = new byte[1] ;
      P09B92_A129BarCod = new int[1] ;
      P09B92_A396EmprCod = new String[] {""} ;
      P09B92_A616MaqOrdSeq = new short[1] ;
      P09B92_n616MaqOrdSeq = new boolean[] {false} ;
      P09B92_A602MaqCod = new String[] {""} ;
      P09B92_A5109RecNumInt = new int[1] ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A602MaqCod = "" ;
      AV111Of9 = "" ;
      P09B93_A872RecPrdNum = new String[] {""} ;
      P09B93_A2804RecLinMaq = new short[1] ;
      P09B93_A130BarCodPar = new String[] {""} ;
      P09B93_A132BarCodReo = new byte[1] ;
      P09B93_A129BarCod = new int[1] ;
      P09B93_A396EmprCod = new String[] {""} ;
      P09B93_A686PrdCant = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P09B93_A811RecLin = new short[1] ;
      P09B93_A1273RecLinPro = new byte[1] ;
      A872RecPrdNum = "" ;
      A686PrdCant = DecimalUtil.ZERO ;
      AV120MoAColorantes = "" ;
      AV119Inicio = GXutil.resetTime( GXutil.nullDate() );
      AV118Fin = GXutil.resetTime( GXutil.nullDate() );
      Gx_msg = "" ;
      AV34FicA = "" ;
      AV12File = "" ;
      AV122Filename = "" ;
      AV121TextFile = new com.genexus.util.GXFile();
      P09B94_A719PrdNum = new String[] {""} ;
      P09B94_n719PrdNum = new boolean[] {false} ;
      P09B94_A2394RecForNro = new byte[1] ;
      P09B94_A2804RecLinMaq = new short[1] ;
      P09B94_A130BarCodPar = new String[] {""} ;
      P09B94_A132BarCodReo = new byte[1] ;
      P09B94_A129BarCod = new int[1] ;
      P09B94_A396EmprCod = new String[] {""} ;
      P09B94_A5109RecNumInt = new int[1] ;
      P09B94_A811RecLin = new short[1] ;
      P09B94_A1273RecLinPro = new byte[1] ;
      A719PrdNum = "" ;
      AV125TextFileLine = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficheroprep__default(),
         new Object[] {
             new Object[] {
            P09B92_A2804RecLinMaq, P09B92_A130BarCodPar, P09B92_A132BarCodReo, P09B92_A129BarCod, P09B92_A396EmprCod, P09B92_A616MaqOrdSeq, P09B92_n616MaqOrdSeq, P09B92_A602MaqCod, P09B92_A5109RecNumInt
            }
            , new Object[] {
            P09B93_A872RecPrdNum, P09B93_A2804RecLinMaq, P09B93_A130BarCodPar, P09B93_A132BarCodReo, P09B93_A129BarCod, P09B93_A396EmprCod, P09B93_A686PrdCant, P09B93_A811RecLin, P09B93_A1273RecLinPro
            }
            , new Object[] {
            P09B94_A719PrdNum, P09B94_n719PrdNum, P09B94_A2394RecForNro, P09B94_A2804RecLinMaq, P09B94_A130BarCodPar, P09B94_A132BarCodReo, P09B94_A129BarCod, P09B94_A396EmprCod, P09B94_A5109RecNumInt, P09B94_A811RecLin,
            P09B94_A1273RecLinPro
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV102Barcodreo ;
   private byte AV57LenVar ;
   private byte AV112ActOF9 ;
   private byte GXt_int3 ;
   private byte GXv_int4[] ;
   private byte A132BarCodReo ;
   private byte A1273RecLinPro ;
   private byte AV105LastRecForNro ;
   private byte A2394RecForNro ;
   private short AV104Reclinmaq ;
   private short A2804RecLinMaq ;
   private short A616MaqOrdSeq ;
   private short AV35Num_mq ;
   private short A811RecLin ;
   private short AV113VarSleep ;
   private short Gx_err ;
   private int AV101Barcod ;
   private int AV98Contval ;
   private int GXt_int1 ;
   private int GXv_int2[] ;
   private int A129BarCod ;
   private int A5109RecNumInt ;
   private int AV38Of6 ;
   private java.math.BigDecimal A686PrdCant ;
   private String AV81EmprCod ;
   private String AV100Dirp ;
   private String AV103Barcodpar ;
   private String AV99Dir ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String AV111Of9 ;
   private String A872RecPrdNum ;
   private String AV120MoAColorantes ;
   private String Gx_msg ;
   private String AV34FicA ;
   private String AV12File ;
   private String A719PrdNum ;
   private java.util.Date AV119Inicio ;
   private java.util.Date AV118Fin ;
   private boolean n616MaqOrdSeq ;
   private boolean n719PrdNum ;
   private String AV125TextFileLine ;
   private String AV123ErrorMessage ;
   private String AV122Filename ;
   private com.genexus.util.GXFile AV121TextFile ;
   private String[] aP6 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private byte[] aP3 ;
   private String[] aP4 ;
   private short[] aP5 ;
   private IDataStoreProvider pr_default ;
   private short[] P09B92_A2804RecLinMaq ;
   private String[] P09B92_A130BarCodPar ;
   private byte[] P09B92_A132BarCodReo ;
   private int[] P09B92_A129BarCod ;
   private String[] P09B92_A396EmprCod ;
   private short[] P09B92_A616MaqOrdSeq ;
   private boolean[] P09B92_n616MaqOrdSeq ;
   private String[] P09B92_A602MaqCod ;
   private int[] P09B92_A5109RecNumInt ;
   private String[] P09B93_A872RecPrdNum ;
   private short[] P09B93_A2804RecLinMaq ;
   private String[] P09B93_A130BarCodPar ;
   private byte[] P09B93_A132BarCodReo ;
   private int[] P09B93_A129BarCod ;
   private String[] P09B93_A396EmprCod ;
   private java.math.BigDecimal[] P09B93_A686PrdCant ;
   private short[] P09B93_A811RecLin ;
   private byte[] P09B93_A1273RecLinPro ;
   private String[] P09B94_A719PrdNum ;
   private boolean[] P09B94_n719PrdNum ;
   private byte[] P09B94_A2394RecForNro ;
   private short[] P09B94_A2804RecLinMaq ;
   private String[] P09B94_A130BarCodPar ;
   private byte[] P09B94_A132BarCodReo ;
   private int[] P09B94_A129BarCod ;
   private String[] P09B94_A396EmprCod ;
   private int[] P09B94_A5109RecNumInt ;
   private short[] P09B94_A811RecLin ;
   private byte[] P09B94_A1273RecLinPro ;
}

final  class ficheroprep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09B92", "SELECT T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.MaqOrdSeq, T1.MaqCod, T1.RecNumInt FROM (TXPRECMAQ T1 INNER JOIN TXPMAQUIN T2 ON T2.EmprCod = T1.EmprCod AND T2.MaqCod = T1.MaqCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09B93", "SELECT RecPrdNum, RecLinMaq, BarCodPar, BarCodReo, BarCod, EmprCod, PrdCant, RecLin, RecLinPro FROM TXPLRECET WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and RecLinMaq = ?) AND (SUBSTR(RecPrdNum, 1, 2) >= '10' and SUBSTR(RecPrdNum, 1, 2) <= '79') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq, RecLinPro, RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09B94", "SELECT T1.PrdNum, T1.RecForNro, T1.RecLinMaq, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.RecNumInt, T1.RecLin, T1.RecLinPro FROM (TXPLRECET T1 INNER JOIN TXPRECMAQ T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.RecLinMaq = T1.RecLinMaq) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.RecLinMaq = ?) AND (T1.RecForNro > 0) AND (SUBSTR(T1.PrdNum, 1, 2) >= '10' and SUBSTR(T1.PrdNum, 1, 2) <= '99') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.RecLinMaq, T1.RecLinPro, T1.RecLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,3);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((byte[]) buf[2])[0] = rslt.getByte(2);
               ((short[]) buf[3])[0] = rslt.getShort(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((int[]) buf[6])[0] = rslt.getInt(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 3);
               ((int[]) buf[8])[0] = rslt.getInt(8);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

