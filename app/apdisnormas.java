package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apdisnormas extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apdisnormas pgm = new apdisnormas (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apdisnormas( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apdisnormas.class ), "" );
   }

   public apdisnormas( int remoteHandle ,
                       ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public void execute( )
   {
      execute_int();
   }

   private void execute_int( )
   {
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      new app.pdbconn(remoteHandle, context).execute( ) ;
      AV8UsurCod = " " ;
      AV9Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV10EmprCod ;
      GXv_char2[0] = AV11EmprNom ;
      GXv_char3[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV9Station, GXv_char1, GXv_char2, GXv_char3) ;
      apdisnormas.this.AV10EmprCod = GXv_char1[0] ;
      apdisnormas.this.AV11EmprNom = GXv_char2[0] ;
      apdisnormas.this.AV8UsurCod = GXv_char3[0] ;
      /* Using cursor P06262 */
      pr_default.execute(0, new Object[] {AV10EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P06262_A396EmprCod[0] ;
         A148BarEstReo = P06262_A148BarEstReo[0] ;
         A129BarCod = P06262_A129BarCod[0] ;
         A130BarCodPar = P06262_A130BarCodPar[0] ;
         A361DisCod = P06262_A361DisCod[0] ;
         A132BarCodReo = P06262_A132BarCodReo[0] ;
         AV12barcod = A129BarCod ;
         AV13barcodreo = (byte)(0) ;
         AV14barcodpar = A130BarCodPar ;
         AV16Discod = A361DisCod ;
         /* Execute user subroutine: 'BARCAD' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor P06263 */
      pr_default.execute(1, new Object[] {AV10EmprCod, Integer.valueOf(AV12barcod), Byte.valueOf(AV13barcodreo), AV14barcodpar});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A130BarCodPar = P06263_A130BarCodPar[0] ;
         A132BarCodReo = P06263_A132BarCodReo[0] ;
         A129BarCod = P06263_A129BarCod[0] ;
         A396EmprCod = P06263_A396EmprCod[0] ;
         A361DisCod = P06263_A361DisCod[0] ;
         AV15DiscodOrigen = A361DisCod ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(1);
      /* Using cursor P06264 */
      pr_default.execute(2, new Object[] {AV10EmprCod, Integer.valueOf(AV15DiscodOrigen)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P06264_A361DisCod[0] ;
         A396EmprCod = P06264_A396EmprCod[0] ;
         A13215DisNormNC = P06264_A13215DisNormNC[0] ;
         A13214DisNormSt = P06264_A13214DisNormSt[0] ;
         A13213DisNormID = P06264_A13213DisNormID[0] ;
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         /*
            INSERT RECORD ON TABLE TXPDISNOR

         */
         W396EmprCod = A396EmprCod ;
         W361DisCod = A361DisCod ;
         W13213DisNormID = A13213DisNormID ;
         A396EmprCod = AV10EmprCod ;
         A361DisCod = AV16Discod ;
         /* Using cursor P06265 */
         pr_default.execute(3, new Object[] {A396EmprCod, Integer.valueOf(A361DisCod), A13213DisNormID, A13214DisNormSt, A13215DisNormNC});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDISNOR");
         if ( (pr_default.getStatus(3) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         A13213DisNormID = W13213DisNormID ;
         /* End Insert */
         A396EmprCod = W396EmprCod ;
         A361DisCod = W361DisCod ;
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pdisnormas.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apdisnormas");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8UsurCod = "" ;
      AV9Station = "" ;
      AV10EmprCod = "" ;
      GXv_char1 = new String[1] ;
      AV11EmprNom = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      scmdbuf = "" ;
      P06262_A396EmprCod = new String[] {""} ;
      P06262_A148BarEstReo = new byte[1] ;
      P06262_A129BarCod = new int[1] ;
      P06262_A130BarCodPar = new String[] {""} ;
      P06262_A361DisCod = new int[1] ;
      P06262_A132BarCodReo = new byte[1] ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV14barcodpar = "" ;
      P06263_A130BarCodPar = new String[] {""} ;
      P06263_A132BarCodReo = new byte[1] ;
      P06263_A129BarCod = new int[1] ;
      P06263_A396EmprCod = new String[] {""} ;
      P06263_A361DisCod = new int[1] ;
      P06264_A361DisCod = new int[1] ;
      P06264_A396EmprCod = new String[] {""} ;
      P06264_A13215DisNormNC = new String[] {""} ;
      P06264_A13214DisNormSt = new String[] {""} ;
      P06264_A13213DisNormID = new String[] {""} ;
      A13215DisNormNC = "" ;
      A13214DisNormSt = "" ;
      A13213DisNormID = "" ;
      W396EmprCod = "" ;
      W13213DisNormID = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apdisnormas__default(),
         new Object[] {
             new Object[] {
            P06262_A396EmprCod, P06262_A148BarEstReo, P06262_A129BarCod, P06262_A130BarCodPar, P06262_A361DisCod, P06262_A132BarCodReo
            }
            , new Object[] {
            P06263_A130BarCodPar, P06263_A132BarCodReo, P06263_A129BarCod, P06263_A396EmprCod, P06263_A361DisCod
            }
            , new Object[] {
            P06264_A361DisCod, P06264_A396EmprCod, P06264_A13215DisNormNC, P06264_A13214DisNormSt, P06264_A13213DisNormID
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A148BarEstReo ;
   private byte A132BarCodReo ;
   private byte AV13barcodreo ;
   private short Gx_err ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int AV12barcod ;
   private int AV16Discod ;
   private int AV15DiscodOrigen ;
   private int W361DisCod ;
   private int GX_INS1812 ;
   private String AV8UsurCod ;
   private String AV9Station ;
   private String AV10EmprCod ;
   private String GXv_char1[] ;
   private String AV11EmprNom ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String AV14barcodpar ;
   private String A13215DisNormNC ;
   private String A13214DisNormSt ;
   private String A13213DisNormID ;
   private String W396EmprCod ;
   private String W13213DisNormID ;
   private String Gx_emsg ;
   private boolean returnInSub ;
   private IDataStoreProvider pr_default ;
   private String[] P06262_A396EmprCod ;
   private byte[] P06262_A148BarEstReo ;
   private int[] P06262_A129BarCod ;
   private String[] P06262_A130BarCodPar ;
   private int[] P06262_A361DisCod ;
   private byte[] P06262_A132BarCodReo ;
   private String[] P06263_A130BarCodPar ;
   private byte[] P06263_A132BarCodReo ;
   private int[] P06263_A129BarCod ;
   private String[] P06263_A396EmprCod ;
   private int[] P06263_A361DisCod ;
   private int[] P06264_A361DisCod ;
   private String[] P06264_A396EmprCod ;
   private String[] P06264_A13215DisNormNC ;
   private String[] P06264_A13214DisNormSt ;
   private String[] P06264_A13213DisNormID ;
}

final  class apdisnormas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P06262", "SELECT EmprCod, BarEstReo, BarCod, BarCodPar, DisCod, BarCodReo FROM TXPBARCAD WHERE EmprCod = ? and BarEstReo = 1 ORDER BY EmprCod, BarEstReo ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P06263", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, DisCod FROM TXPBARCAD WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P06264", "SELECT DisCod, EmprCod, DisNormNC, DisNormSt, DisNormID FROM TXPDISNOR WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod, DisNormID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P06265", "INSERT INTO TXPDISNOR(EmprCod, DisCod, DisNormID, DisNormSt, DisNormNC) VALUES(?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDISNOR")
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 4);
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 1);
               return;
      }
   }

}

