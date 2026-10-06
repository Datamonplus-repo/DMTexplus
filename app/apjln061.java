package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apjln061 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apjln061 pgm = new apjln061 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apjln061( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apjln061.class ), "" );
   }

   public apjln061( int remoteHandle ,
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
      System.out.println( httpContext.getMessage( "Actualizando GRULEC.....", "") );
      /* Using cursor P01XK2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1166LecMaqCod = P01XK2_A1166LecMaqCod[0] ;
         A1188LecFasOrd = P01XK2_A1188LecFasOrd[0] ;
         n1188LecFasOrd = P01XK2_n1188LecFasOrd[0] ;
         A1169LecBarPar = P01XK2_A1169LecBarPar[0] ;
         n1169LecBarPar = P01XK2_n1169LecBarPar[0] ;
         A1168LecBarReo = P01XK2_A1168LecBarReo[0] ;
         n1168LecBarReo = P01XK2_n1168LecBarReo[0] ;
         A1167LecBarCod = P01XK2_A1167LecBarCod[0] ;
         n1167LecBarCod = P01XK2_n1167LecBarCod[0] ;
         A396EmprCod = P01XK2_A396EmprCod[0] ;
         A1796LecTipEnt = P01XK2_A1796LecTipEnt[0] ;
         n1796LecTipEnt = P01XK2_n1796LecTipEnt[0] ;
         /* Using cursor P01XK3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n1167LecBarCod), Integer.valueOf(A1167LecBarCod), Boolean.valueOf(n1168LecBarReo), Byte.valueOf(A1168LecBarReo), Boolean.valueOf(n1169LecBarPar), A1169LecBarPar, Boolean.valueOf(n1188LecFasOrd), Short.valueOf(A1188LecFasOrd)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A129BarCod = P01XK3_A129BarCod[0] ;
            A132BarCodReo = P01XK3_A132BarCodReo[0] ;
            A130BarCodPar = P01XK3_A130BarCodPar[0] ;
            A194BarOrdLin = P01XK3_A194BarOrdLin[0] ;
            A153BarFasEst = P01XK3_A153BarFasEst[0] ;
            A758ProCod = P01XK3_A758ProCod[0] ;
            W396EmprCod = A396EmprCod ;
            if ( A153BarFasEst == 1 )
            {
               /*
                  INSERT RECORD ON TABLE TXPGRULEC

               */
               W396EmprCod = A396EmprCod ;
               A1794GruLecMaq = A1166LecMaqCod ;
               A1795GruOrd = (byte)(0) ;
               A1791GruBarCod = A1167LecBarCod ;
               A1793GruBarReo = A1168LecBarReo ;
               A1792GruBarPar = A1169LecBarPar ;
               /* Using cursor P01XK4 */
               pr_default.execute(2, new Object[] {A396EmprCod, A1794GruLecMaq, Byte.valueOf(A1795GruOrd), Integer.valueOf(A1791GruBarCod), Byte.valueOf(A1793GruBarReo), A1792GruBarPar});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPGRULEC");
               if ( (pr_default.getStatus(2) == 1) )
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
               /* End Insert */
            }
            A396EmprCod = W396EmprCod ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         A1796LecTipEnt = httpContext.getMessage( "H", "") ;
         n1796LecTipEnt = false ;
         /* Using cursor P01XK5 */
         pr_default.execute(3, new Object[] {Boolean.valueOf(n1796LecTipEnt), A1796LecTipEnt, A396EmprCod, A1166LecMaqCod});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLECTOR");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Actualizacion GRULEC.....", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pjln061.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apjln061");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      scmdbuf = "" ;
      P01XK2_A1166LecMaqCod = new String[] {""} ;
      P01XK2_A1188LecFasOrd = new short[1] ;
      P01XK2_n1188LecFasOrd = new boolean[] {false} ;
      P01XK2_A1169LecBarPar = new String[] {""} ;
      P01XK2_n1169LecBarPar = new boolean[] {false} ;
      P01XK2_A1168LecBarReo = new byte[1] ;
      P01XK2_n1168LecBarReo = new boolean[] {false} ;
      P01XK2_A1167LecBarCod = new int[1] ;
      P01XK2_n1167LecBarCod = new boolean[] {false} ;
      P01XK2_A396EmprCod = new String[] {""} ;
      P01XK2_A1796LecTipEnt = new String[] {""} ;
      P01XK2_n1796LecTipEnt = new boolean[] {false} ;
      A1166LecMaqCod = "" ;
      A1169LecBarPar = "" ;
      A396EmprCod = "" ;
      A1796LecTipEnt = "" ;
      P01XK3_A396EmprCod = new String[] {""} ;
      P01XK3_A129BarCod = new int[1] ;
      P01XK3_A132BarCodReo = new byte[1] ;
      P01XK3_A130BarCodPar = new String[] {""} ;
      P01XK3_A194BarOrdLin = new short[1] ;
      P01XK3_A153BarFasEst = new byte[1] ;
      P01XK3_A758ProCod = new String[] {""} ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      W396EmprCod = "" ;
      A1794GruLecMaq = "" ;
      A1792GruBarPar = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apjln061__default(),
         new Object[] {
             new Object[] {
            P01XK2_A1166LecMaqCod, P01XK2_A1188LecFasOrd, P01XK2_n1188LecFasOrd, P01XK2_A1169LecBarPar, P01XK2_n1169LecBarPar, P01XK2_A1168LecBarReo, P01XK2_n1168LecBarReo, P01XK2_A1167LecBarCod, P01XK2_n1167LecBarCod, P01XK2_A396EmprCod,
            P01XK2_A1796LecTipEnt, P01XK2_n1796LecTipEnt
            }
            , new Object[] {
            P01XK3_A396EmprCod, P01XK3_A129BarCod, P01XK3_A132BarCodReo, P01XK3_A130BarCodPar, P01XK3_A194BarOrdLin, P01XK3_A153BarFasEst, P01XK3_A758ProCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1168LecBarReo ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte A1795GruOrd ;
   private byte A1793GruBarReo ;
   private short A1188LecFasOrd ;
   private short A194BarOrdLin ;
   private short Gx_err ;
   private int A1167LecBarCod ;
   private int A129BarCod ;
   private int GX_INS248 ;
   private int A1791GruBarCod ;
   private String scmdbuf ;
   private String A1166LecMaqCod ;
   private String A1169LecBarPar ;
   private String A396EmprCod ;
   private String A1796LecTipEnt ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String W396EmprCod ;
   private String A1794GruLecMaq ;
   private String A1792GruBarPar ;
   private String Gx_emsg ;
   private boolean n1188LecFasOrd ;
   private boolean n1169LecBarPar ;
   private boolean n1168LecBarReo ;
   private boolean n1167LecBarCod ;
   private boolean n1796LecTipEnt ;
   private IDataStoreProvider pr_default ;
   private String[] P01XK2_A1166LecMaqCod ;
   private short[] P01XK2_A1188LecFasOrd ;
   private boolean[] P01XK2_n1188LecFasOrd ;
   private String[] P01XK2_A1169LecBarPar ;
   private boolean[] P01XK2_n1169LecBarPar ;
   private byte[] P01XK2_A1168LecBarReo ;
   private boolean[] P01XK2_n1168LecBarReo ;
   private int[] P01XK2_A1167LecBarCod ;
   private boolean[] P01XK2_n1167LecBarCod ;
   private String[] P01XK2_A396EmprCod ;
   private String[] P01XK2_A1796LecTipEnt ;
   private boolean[] P01XK2_n1796LecTipEnt ;
   private String[] P01XK3_A396EmprCod ;
   private int[] P01XK3_A129BarCod ;
   private byte[] P01XK3_A132BarCodReo ;
   private String[] P01XK3_A130BarCodPar ;
   private short[] P01XK3_A194BarOrdLin ;
   private byte[] P01XK3_A153BarFasEst ;
   private String[] P01XK3_A758ProCod ;
}

final  class apjln061__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01XK2", "SELECT LecMaqCod, LecFasOrd, LecBarPar, LecBarReo, LecBarCod, EmprCod, LecTipEnt FROM TXPLECTOR ORDER BY EmprCod, LecMaqCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P01XK3", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin, BarFasEst, ProCod FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? and BarOrdLin = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P01XK4", "INSERT INTO TXPGRULEC(EmprCod, GruLecMaq, GruOrd, GruBarCod, GruBarReo, GruBarPar, GruOrdLin, GruFasCod, GruParco, GruOpera) VALUES(?, ?, ?, ?, ?, ?, 0, ' ', 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPGRULEC")
         ,new UpdateCursor("P01XK5", "UPDATE TXPLECTOR SET LecTipEnt=?  WHERE EmprCod = ? AND LecMaqCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLECTOR")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
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
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(3, ((Number) parms[4]).byteValue());
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[6], 1);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[8]).shortValue());
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               stmt.setString(6, (String)parms[5], 1);
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 1);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 6);
               return;
      }
   }

}

