package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aphdrmaq extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aphdrmaq pgm = new aphdrmaq (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aphdrmaq( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aphdrmaq.class ), "" );
   }

   public aphdrmaq( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "GENERANDO RECETAS POR CAMBIOS DE MAQUINA....", "") );
      AV11Station = context.getWorkstationId( remoteHandle) ;
      GXv_char1[0] = AV12EmprCod ;
      GXv_char2[0] = AV13EmprNom ;
      GXv_char3[0] = AV14UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV11Station, GXv_char1, GXv_char2, GXv_char3) ;
      aphdrmaq.this.AV12EmprCod = GXv_char1[0] ;
      aphdrmaq.this.AV13EmprNom = GXv_char2[0] ;
      aphdrmaq.this.AV14UsurCod = GXv_char3[0] ;
      /* Using cursor P037M2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8411HdrPlaPar = P037M2_A8411HdrPlaPar[0] ;
         A8410HdrPlaReo = P037M2_A8410HdrPlaReo[0] ;
         A8409HdrPlaCod = P037M2_A8409HdrPlaCod[0] ;
         A8413MaqPlaAnt = P037M2_A8413MaqPlaAnt[0] ;
         n8413MaqPlaAnt = P037M2_n8413MaqPlaAnt[0] ;
         A8412MaqPlaAct = P037M2_A8412MaqPlaAct[0] ;
         n8412MaqPlaAct = P037M2_n8412MaqPlaAct[0] ;
         AV15MaqPlaAnt = A8413MaqPlaAnt ;
         AV20Barmaqcod = A8412MaqPlaAct ;
         /* Optimized UPDATE. */
         /* Using cursor P037M3 */
         pr_default.execute(1, new Object[] {AV20Barmaqcod, AV12EmprCod, Integer.valueOf(A8409HdrPlaCod), Byte.valueOf(A8410HdrPlaReo), A8411HdrPlaPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPBARCAD");
         /* End optimized UPDATE. */
         /* Using cursor P037M4 */
         pr_default.execute(2, new Object[] {AV12EmprCod, Integer.valueOf(A8409HdrPlaCod), Byte.valueOf(A8410HdrPlaReo), A8411HdrPlaPar, AV15MaqPlaAnt});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A129BarCod = P037M4_A129BarCod[0] ;
            A132BarCodReo = P037M4_A132BarCodReo[0] ;
            A130BarCodPar = P037M4_A130BarCodPar[0] ;
            A602MaqCod = P037M4_A602MaqCod[0] ;
            A396EmprCod = P037M4_A396EmprCod[0] ;
            A2804RecLinMaq = P037M4_A2804RecLinMaq[0] ;
            A2805RecVolPrd = P037M4_A2805RecVolPrd[0] ;
            AV16RecLinMaq = A2804RecLinMaq ;
            AV23Barvolmaq = A2805RecVolPrd ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(2);
         }
         pr_default.close(2);
         GXv_char3[0] = AV12EmprCod ;
         GXv_int4[0] = A8409HdrPlaCod ;
         GXv_int5[0] = A8410HdrPlaReo ;
         GXv_char2[0] = A8411HdrPlaPar ;
         GXv_int6[0] = AV16RecLinMaq ;
         GXv_char1[0] = AV20Barmaqcod ;
         GXv_int7[0] = AV23Barvolmaq ;
         new app.planrevp(remoteHandle, context).execute( GXv_char3, GXv_int4, GXv_int5, GXv_char2, GXv_int6, GXv_char1, GXv_int7) ;
         aphdrmaq.this.AV12EmprCod = GXv_char3[0] ;
         aphdrmaq.this.A8409HdrPlaCod = GXv_int4[0] ;
         aphdrmaq.this.A8410HdrPlaReo = GXv_int5[0] ;
         aphdrmaq.this.A8411HdrPlaPar = GXv_char2[0] ;
         aphdrmaq.this.AV16RecLinMaq = GXv_int6[0] ;
         aphdrmaq.this.AV20Barmaqcod = GXv_char1[0] ;
         aphdrmaq.this.AV23Barvolmaq = GXv_int7[0] ;
         /* Using cursor P037M5 */
         pr_default.execute(3, new Object[] {Integer.valueOf(A8409HdrPlaCod), Byte.valueOf(A8410HdrPlaReo), A8411HdrPlaPar});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPHDRMAQ");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "GENERACION DE RECETAS REALIZADA", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(phdrmaq.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aphdrmaq");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV11Station = "" ;
      AV12EmprCod = "" ;
      AV13EmprNom = "" ;
      AV14UsurCod = "" ;
      scmdbuf = "" ;
      P037M2_A8411HdrPlaPar = new String[] {""} ;
      P037M2_A8410HdrPlaReo = new byte[1] ;
      P037M2_A8409HdrPlaCod = new int[1] ;
      P037M2_A8413MaqPlaAnt = new String[] {""} ;
      P037M2_n8413MaqPlaAnt = new boolean[] {false} ;
      P037M2_A8412MaqPlaAct = new String[] {""} ;
      P037M2_n8412MaqPlaAct = new boolean[] {false} ;
      A8411HdrPlaPar = "" ;
      A8413MaqPlaAnt = "" ;
      A8412MaqPlaAct = "" ;
      AV15MaqPlaAnt = "" ;
      AV20Barmaqcod = "" ;
      A180BarMaqCod = "" ;
      P037M4_A129BarCod = new int[1] ;
      P037M4_A132BarCodReo = new byte[1] ;
      P037M4_A130BarCodPar = new String[] {""} ;
      P037M4_A602MaqCod = new String[] {""} ;
      P037M4_A396EmprCod = new String[] {""} ;
      P037M4_A2804RecLinMaq = new short[1] ;
      P037M4_A2805RecVolPrd = new int[1] ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      A396EmprCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      GXv_int5 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_char1 = new String[1] ;
      GXv_int7 = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aphdrmaq__default(),
         new Object[] {
             new Object[] {
            P037M2_A8411HdrPlaPar, P037M2_A8410HdrPlaReo, P037M2_A8409HdrPlaCod, P037M2_A8413MaqPlaAnt, P037M2_n8413MaqPlaAnt, P037M2_A8412MaqPlaAct, P037M2_n8412MaqPlaAct
            }
            , new Object[] {
            }
            , new Object[] {
            P037M4_A129BarCod, P037M4_A132BarCodReo, P037M4_A130BarCodPar, P037M4_A602MaqCod, P037M4_A396EmprCod, P037M4_A2804RecLinMaq, P037M4_A2805RecVolPrd
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A8410HdrPlaReo ;
   private byte A132BarCodReo ;
   private byte GXv_int5[] ;
   private short A2804RecLinMaq ;
   private short AV16RecLinMaq ;
   private short GXv_int6[] ;
   private short Gx_err ;
   private int A8409HdrPlaCod ;
   private int A129BarCod ;
   private int A2805RecVolPrd ;
   private int AV23Barvolmaq ;
   private int GXv_int4[] ;
   private int GXv_int7[] ;
   private String AV11Station ;
   private String AV12EmprCod ;
   private String AV13EmprNom ;
   private String AV14UsurCod ;
   private String scmdbuf ;
   private String A8411HdrPlaPar ;
   private String A8413MaqPlaAnt ;
   private String A8412MaqPlaAct ;
   private String AV15MaqPlaAnt ;
   private String AV20Barmaqcod ;
   private String A180BarMaqCod ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String A396EmprCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char1[] ;
   private boolean n8413MaqPlaAnt ;
   private boolean n8412MaqPlaAct ;
   private IDataStoreProvider pr_default ;
   private String[] P037M2_A8411HdrPlaPar ;
   private byte[] P037M2_A8410HdrPlaReo ;
   private int[] P037M2_A8409HdrPlaCod ;
   private String[] P037M2_A8413MaqPlaAnt ;
   private boolean[] P037M2_n8413MaqPlaAnt ;
   private String[] P037M2_A8412MaqPlaAct ;
   private boolean[] P037M2_n8412MaqPlaAct ;
   private int[] P037M4_A129BarCod ;
   private byte[] P037M4_A132BarCodReo ;
   private String[] P037M4_A130BarCodPar ;
   private String[] P037M4_A602MaqCod ;
   private String[] P037M4_A396EmprCod ;
   private short[] P037M4_A2804RecLinMaq ;
   private int[] P037M4_A2805RecVolPrd ;
}

final  class aphdrmaq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037M2", "SELECT HdrPlaPar, HdrPlaReo, HdrPlaCod, MaqPlaAnt, MaqPlaAct FROM TXPHDRMAQ ORDER BY HdrPlaCod, HdrPlaReo, HdrPlaPar ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P037M3", "UPDATE TXPBARCAD SET BarMaqCod=?  WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPBARCAD")
         ,new ForEachCursor("P037M4", "SELECT * FROM (SELECT BarCod, BarCodReo, BarCodPar, MaqCod, EmprCod, RecLinMaq, RecVolPrd FROM TXPRECMAQ WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (MaqCod = ?) ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P037M5", "DELETE FROM TXPHDRMAQ  WHERE HdrPlaCod = ? AND HdrPlaReo = ? AND HdrPlaPar = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPHDRMAQ")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 6);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((short[]) buf[5])[0] = rslt.getShort(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 1 :
               stmt.setString(1, (String)parms[0], 6);
               stmt.setString(2, (String)parms[1], 3);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setByte(4, ((Number) parms[3]).byteValue());
               stmt.setString(5, (String)parms[4], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 6);
               return;
            case 3 :
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setString(3, (String)parms[2], 1);
               return;
      }
   }

}

