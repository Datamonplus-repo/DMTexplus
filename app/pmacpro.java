package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmacpro extends GXProcedure
{
   public pmacpro( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmacpro.class ), "" );
   }

   public pmacpro( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          byte[] aP2 )
   {
      pmacpro.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        byte[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             byte[] aP2 ,
                             int[] aP3 )
   {
      pmacpro.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmacpro.this.AV8MaCproCod = aP1[0];
      this.aP1 = aP1;
      pmacpro.this.AV9Opcion = aP2[0];
      this.aP2 = aP2;
      pmacpro.this.AV10Num_c = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10Num_c = 0 ;
      if ( AV9Opcion == 1 )
      {
         /* Using cursor P01Y52 */
         pr_default.execute(0, new Object[] {A396EmprCod, AV8MaCproCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1514MacProCod = P01Y52_A1514MacProCod[0] ;
            n1514MacProCod = P01Y52_n1514MacProCod[0] ;
            A1515MacProDsc = P01Y52_A1515MacProDsc[0] ;
            /* Optimized DELETE. */
            /* Using cursor P01Y53 */
            pr_default.execute(1, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLMACPR");
            /* End optimized DELETE. */
            /* Using cursor P01Y54 */
            pr_default.execute(2, new Object[] {A396EmprCod, Boolean.valueOf(n1514MacProCod), A1514MacProCod});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCMACPR");
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
      }
      else if ( AV9Opcion == 2 )
      {
         AV10Num_c = 0 ;
         /* Optimized group. */
         /* Using cursor P01Y55 */
         pr_default.execute(3, new Object[] {A396EmprCod, AV8MaCproCod});
         cV10Num_c = P01Y55_AV10Num_c[0] ;
         pr_default.close(3);
         AV10Num_c = (int)(AV10Num_c+cV10Num_c*1) ;
         /* End optimized group. */
      }
      else
      {
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmacpro.this.A396EmprCod;
      this.aP1[0] = pmacpro.this.AV8MaCproCod;
      this.aP2[0] = pmacpro.this.AV9Opcion;
      this.aP3[0] = pmacpro.this.AV10Num_c;
      Application.commitDataStores(context, remoteHandle, pr_default, "pmacpro");
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
      P01Y52_A396EmprCod = new String[] {""} ;
      P01Y52_A1514MacProCod = new String[] {""} ;
      P01Y52_n1514MacProCod = new boolean[] {false} ;
      P01Y52_A1515MacProDsc = new String[] {""} ;
      A1514MacProCod = "" ;
      A1515MacProDsc = "" ;
      P01Y55_AV10Num_c = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmacpro__default(),
         new Object[] {
             new Object[] {
            P01Y52_A396EmprCod, P01Y52_A1514MacProCod, P01Y52_A1515MacProDsc
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            P01Y55_AV10Num_c
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV9Opcion ;
   private short Gx_err ;
   private int AV10Num_c ;
   private int cV10Num_c ;
   private String A396EmprCod ;
   private String AV8MaCproCod ;
   private String scmdbuf ;
   private String A1514MacProCod ;
   private String A1515MacProDsc ;
   private boolean n1514MacProCod ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private byte[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P01Y52_A396EmprCod ;
   private String[] P01Y52_A1514MacProCod ;
   private boolean[] P01Y52_n1514MacProCod ;
   private String[] P01Y52_A1515MacProDsc ;
   private int[] P01Y55_AV10Num_c ;
}

final  class pmacpro__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P01Y52", "SELECT EmprCod, MacProCod, MacProDsc FROM TXPCMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("P01Y53", "DELETE FROM TXPLMACPR  WHERE EmprCod = ? and MacProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLMACPR")
         ,new UpdateCursor("P01Y54", "DELETE FROM TXPCMACPR  WHERE EmprCod = ? AND MacProCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCMACPR")
         ,new ForEachCursor("P01Y55", "SELECT COUNT(*) FROM TXPCFORMU WHERE EmprCod = ? and MacProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
               stmt.setString(2, (String)parms[1], 6);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 6);
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

