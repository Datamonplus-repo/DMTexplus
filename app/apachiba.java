package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class apachiba extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      apachiba pgm = new apachiba (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public apachiba( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( apachiba.class ), "" );
   }

   public apachiba( int remoteHandle ,
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
      AV82EmprCod = "001" ;
      /* Using cursor P000N2 */
      pr_default.execute(0, new Object[] {AV82EmprCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P000N2_A396EmprCod[0] ;
         A9750Emp_UnU = P000N2_A9750Emp_UnU[0] ;
         n9750Emp_UnU = P000N2_n9750Emp_UnU[0] ;
         A9751Emp_PzU = P000N2_A9751Emp_PzU[0] ;
         n9751Emp_PzU = P000N2_n9751Emp_PzU[0] ;
         A5860Emp_Anp = P000N2_A5860Emp_Anp[0] ;
         A9743Emp_CUb = P000N2_A9743Emp_CUb[0] ;
         A44AlbRecCod = P000N2_A44AlbRecCod[0] ;
         AV79AlbReccod = A44AlbRecCod ;
         AV80Emp_cub = A9743Emp_CUb ;
         AV81Emp_anp = A5860Emp_Anp ;
         /* Execute user subroutine: 'UBIDPG' */
         S111 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         A9750Emp_UnU = AV83Emp_unu ;
         n9750Emp_UnU = false ;
         A9751Emp_PzU = AV84Emp_pzu ;
         n9751Emp_PzU = false ;
         /* Using cursor P000N3 */
         pr_default.execute(1, new Object[] {Boolean.valueOf(n9750Emp_UnU), A9750Emp_UnU, Boolean.valueOf(n9751Emp_PzU), Integer.valueOf(A9751Emp_PzU), A396EmprCod, Integer.valueOf(A44AlbRecCod), A9743Emp_CUb, Short.valueOf(A5860Emp_Anp)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPUBIIN");
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso Finalizado", ""));
      cleanup();
   }

   public void S111( )
   {
      /* 'UBIDPG' Routine */
      returnInSub = false ;
      AV83Emp_unu = DecimalUtil.doubleToDec(0) ;
      AV84Emp_pzu = 0 ;
      /* Optimized group. */
      /* Using cursor P000N4 */
      pr_default.execute(2, new Object[] {AV82EmprCod, Integer.valueOf(AV79AlbReccod), AV80Emp_cub, Short.valueOf(AV81Emp_anp)});
      c4344Dp_PzU = P000N4_A4344Dp_PzU[0] ;
      n4344Dp_PzU = P000N4_n4344Dp_PzU[0] ;
      c4982Dp_UnU = P000N4_A4982Dp_UnU[0] ;
      n4982Dp_UnU = P000N4_n4982Dp_UnU[0] ;
      pr_default.close(2);
      AV84Emp_pzu = (int)(AV84Emp_pzu+c4344Dp_PzU) ;
      AV83Emp_unu = AV83Emp_unu.add(c4982Dp_UnU) ;
      /* End optimized group. */
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(pachiba.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "apachiba");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV82EmprCod = "" ;
      scmdbuf = "" ;
      P000N2_A396EmprCod = new String[] {""} ;
      P000N2_A9750Emp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000N2_n9750Emp_UnU = new boolean[] {false} ;
      P000N2_A9751Emp_PzU = new int[1] ;
      P000N2_n9751Emp_PzU = new boolean[] {false} ;
      P000N2_A5860Emp_Anp = new short[1] ;
      P000N2_A9743Emp_CUb = new String[] {""} ;
      P000N2_A44AlbRecCod = new int[1] ;
      A396EmprCod = "" ;
      A9750Emp_UnU = DecimalUtil.ZERO ;
      A9743Emp_CUb = "" ;
      AV80Emp_cub = "" ;
      AV83Emp_unu = DecimalUtil.ZERO ;
      c4982Dp_UnU = DecimalUtil.ZERO ;
      P000N4_A4344Dp_PzU = new int[1] ;
      P000N4_n4344Dp_PzU = new boolean[] {false} ;
      P000N4_A4982Dp_UnU = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P000N4_n4982Dp_UnU = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.apachiba__default(),
         new Object[] {
             new Object[] {
            P000N2_A396EmprCod, P000N2_A9750Emp_UnU, P000N2_n9750Emp_UnU, P000N2_A9751Emp_PzU, P000N2_n9751Emp_PzU, P000N2_A5860Emp_Anp, P000N2_A9743Emp_CUb, P000N2_A44AlbRecCod
            }
            , new Object[] {
            }
            , new Object[] {
            P000N4_A4344Dp_PzU, P000N4_n4344Dp_PzU, P000N4_A4982Dp_UnU, P000N4_n4982Dp_UnU
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A5860Emp_Anp ;
   private short AV81Emp_anp ;
   private short Gx_err ;
   private int A9751Emp_PzU ;
   private int A44AlbRecCod ;
   private int AV79AlbReccod ;
   private int AV84Emp_pzu ;
   private int c4344Dp_PzU ;
   private java.math.BigDecimal A9750Emp_UnU ;
   private java.math.BigDecimal AV83Emp_unu ;
   private java.math.BigDecimal c4982Dp_UnU ;
   private String AV82EmprCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A9743Emp_CUb ;
   private String AV80Emp_cub ;
   private boolean n9750Emp_UnU ;
   private boolean n9751Emp_PzU ;
   private boolean returnInSub ;
   private boolean n4344Dp_PzU ;
   private boolean n4982Dp_UnU ;
   private IDataStoreProvider pr_default ;
   private String[] P000N2_A396EmprCod ;
   private java.math.BigDecimal[] P000N2_A9750Emp_UnU ;
   private boolean[] P000N2_n9750Emp_UnU ;
   private int[] P000N2_A9751Emp_PzU ;
   private boolean[] P000N2_n9751Emp_PzU ;
   private short[] P000N2_A5860Emp_Anp ;
   private String[] P000N2_A9743Emp_CUb ;
   private int[] P000N2_A44AlbRecCod ;
   private int[] P000N4_A4344Dp_PzU ;
   private boolean[] P000N4_n4344Dp_PzU ;
   private java.math.BigDecimal[] P000N4_A4982Dp_UnU ;
   private boolean[] P000N4_n4982Dp_UnU ;
}

final  class apachiba__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000N2", "SELECT EmprCod, Emp_UnU, Emp_PzU, Emp_Anp, Emp_CUb, AlbRecCod FROM TXPUBIIN WHERE EmprCod = ? ORDER BY EmprCod, AlbRecCod, Emp_CUb, Emp_Anp ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P000N3", "UPDATE TXPUBIIN SET Emp_UnU=?, Emp_PzU=?  WHERE EmprCod = ? AND AlbRecCod = ? AND Emp_CUb = ? AND Emp_Anp = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPUBIIN")
         ,new ForEachCursor("P000N4", "SELECT SUM(Dp_PzU), SUM(Dp_UnU) FROM TXPUBIDPG WHERE EmprCod = ? and Dp_Nrecep = ? and Dp_Ubi = ? and Dp_Plg = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((int[]) buf[3])[0] = rslt.getInt(3);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(4);
               ((String[]) buf[6])[0] = rslt.getString(5, 10);
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(1, (java.math.BigDecimal)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[3]).intValue());
               }
               stmt.setString(3, (String)parms[4], 3);
               stmt.setInt(4, ((Number) parms[5]).intValue());
               stmt.setString(5, (String)parms[6], 10);
               stmt.setShort(6, ((Number) parms[7]).shortValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 10);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               return;
      }
   }

}

