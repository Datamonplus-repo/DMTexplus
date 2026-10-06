package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.search.*;
import java.sql.*;

public final  class aputil15 extends GXProcedure
{
   public static void main( String args[] )
   {
      Application.init(app.GXcfg.class);
      aputil15 pgm = new aputil15 (-1);
      Application.realMainProgram = pgm;
      pgm.executeCmdLine(args);
      GXRuntime.exit( );
   }

   public void executeCmdLine( String args[] )
   {

      execute();
   }

   public aputil15( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( aputil15.class ), "" );
   }

   public aputil15( int remoteHandle ,
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
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Actualizo Grupos Operarios F(Operarios)", ""));
      /* Using cursor P00LW2 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A652OpeCod = P00LW2_A652OpeCod[0] ;
         A396EmprCod = P00LW2_A396EmprCod[0] ;
         A653OpeNom = P00LW2_A653OpeNom[0] ;
         n653OpeNom = P00LW2_n653OpeNom[0] ;
         AV16OpeCod = A652OpeCod ;
         AV15OpeNom = A653OpeNom ;
         AV17FlagOpe = (byte)(0) ;
         /* Using cursor P00LW3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV16OpeCod), Integer.valueOf(A652OpeCod), A396EmprCod, Integer.valueOf(AV16OpeCod), Integer.valueOf(A652OpeCod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A503GruOpeCod = P00LW3_A503GruOpeCod[0] ;
            /* Using cursor P00LW4 */
            pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod)});
            A504GruOpeDsc = P00LW4_A504GruOpeDsc[0] ;
            n504GruOpeDsc = P00LW4_n504GruOpeDsc[0] ;
            AV17FlagOpe = (byte)(1) ;
            A504GruOpeDsc = AV15OpeNom ;
            n504GruOpeDsc = false ;
            /* Using cursor P00LW5 */
            pr_default.execute(3, new Object[] {Boolean.valueOf(n504GruOpeDsc), A504GruOpeDsc, A396EmprCod, Integer.valueOf(A503GruOpeCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCGRUOP");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
         pr_default.close(2);
         if ( (0==AV17FlagOpe) )
         {
            /*
               INSERT RECORD ON TABLE TXPCGRUOP

            */
            A503GruOpeCod = AV16OpeCod ;
            A504GruOpeDsc = AV15OpeNom ;
            n504GruOpeDsc = false ;
            /* Using cursor P00LW6 */
            pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Boolean.valueOf(n504GruOpeDsc), A504GruOpeDsc});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCGRUOP");
            if ( (pr_default.getStatus(4) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            /* End Insert */
            /*
               INSERT RECORD ON TABLE TXPLGRUOP

            */
            W652OpeCod = A652OpeCod ;
            A503GruOpeCod = AV16OpeCod ;
            A652OpeCod = AV16OpeCod ;
            /* Using cursor P00LW7 */
            pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A503GruOpeCod), Integer.valueOf(A652OpeCod)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLGRUOP");
            if ( (pr_default.getStatus(5) == 1) )
            {
               Gx_err = (short)(1) ;
               Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
            }
            else
            {
               Gx_err = (short)(0) ;
               Gx_emsg = "" ;
            }
            A652OpeCod = W652OpeCod ;
            /* End Insert */
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Fin Actualizo Grupos Operarios F(Operarios)", ""));
      cleanup();
   }

   public static Object refClasses( )
   {
      GXutil.refClasses(putil15.class);
      return new app.GXcfg();
   }

   protected void cleanup( )
   {
      Application.commitDataStores(context, remoteHandle, pr_default, "aputil15");
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
      P00LW2_A652OpeCod = new int[1] ;
      P00LW2_A396EmprCod = new String[] {""} ;
      P00LW2_A653OpeNom = new String[] {""} ;
      P00LW2_n653OpeNom = new boolean[] {false} ;
      A396EmprCod = "" ;
      A653OpeNom = "" ;
      AV15OpeNom = "" ;
      P00LW3_A396EmprCod = new String[] {""} ;
      P00LW3_A652OpeCod = new int[1] ;
      P00LW3_A503GruOpeCod = new int[1] ;
      P00LW4_A504GruOpeDsc = new String[] {""} ;
      P00LW4_n504GruOpeDsc = new boolean[] {false} ;
      A504GruOpeDsc = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.aputil15__default(),
         new Object[] {
             new Object[] {
            P00LW2_A652OpeCod, P00LW2_A396EmprCod, P00LW2_A653OpeNom, P00LW2_n653OpeNom
            }
            , new Object[] {
            P00LW3_A396EmprCod, P00LW3_A652OpeCod, P00LW3_A503GruOpeCod
            }
            , new Object[] {
            P00LW4_A504GruOpeDsc, P00LW4_n504GruOpeDsc
            }
            , new Object[] {
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

   private byte AV17FlagOpe ;
   private short Gx_err ;
   private int A652OpeCod ;
   private int AV16OpeCod ;
   private int A503GruOpeCod ;
   private int GX_INS53 ;
   private int GX_INS54 ;
   private int W652OpeCod ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A653OpeNom ;
   private String AV15OpeNom ;
   private String A504GruOpeDsc ;
   private String Gx_emsg ;
   private boolean n653OpeNom ;
   private boolean n504GruOpeDsc ;
   private IDataStoreProvider pr_default ;
   private int[] P00LW2_A652OpeCod ;
   private String[] P00LW2_A396EmprCod ;
   private String[] P00LW2_A653OpeNom ;
   private boolean[] P00LW2_n653OpeNom ;
   private String[] P00LW3_A396EmprCod ;
   private int[] P00LW3_A652OpeCod ;
   private int[] P00LW3_A503GruOpeCod ;
   private String[] P00LW4_A504GruOpeDsc ;
   private boolean[] P00LW4_n504GruOpeDsc ;
}

final  class aputil15__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00LW2", "SELECT OpeCod, EmprCod, OpeNom FROM TXPOPERAR ORDER BY EmprCod, OpeCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P00LW3", "SELECT EmprCod, OpeCod, GruOpeCod FROM TXPLGRUOP WHERE (EmprCod = ? AND GruOpeCod = ? AND OpeCod = ?) AND (EmprCod = ? and GruOpeCod = ? and OpeCod = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P00LW4", "SELECT GruOpeDsc FROM TXPCGRUOP WHERE EmprCod = ? AND GruOpeCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P00LW5", "UPDATE TXPCGRUOP SET GruOpeDsc=?  WHERE EmprCod = ? AND GruOpeCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCGRUOP")
         ,new UpdateCursor("P00LW6", "INSERT INTO TXPCGRUOP(EmprCod, GruOpeCod, GruOpeDsc) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCGRUOP")
         ,new UpdateCursor("P00LW7", "INSERT INTO TXPLGRUOP(EmprCod, GruOpeCod, OpeCod) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLGRUOP")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 20);
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setInt(3, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[3], 20);
               }
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
      }
   }

}

