package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pdevpar extends GXProcedure
{
   public pdevpar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pdevpar.class ), "" );
   }

   public pdevpar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          String[] aP1 ,
                          int[] aP2 )
   {
      pdevpar.this.aP3 = new int[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        int[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             int[] aP3 )
   {
      pdevpar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pdevpar.this.A966PartCod = aP1[0];
      this.aP1 = aP1;
      pdevpar.this.A252CliCod = aP2[0];
      this.aP2 = aP2;
      pdevpar.this.A981PartAlbDis = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P02HO2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n981PartAlbDis), Integer.valueOf(A981PartAlbDis)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A980PartLinTip = P02HO2_A980PartLinTip[0] ;
         n980PartLinTip = P02HO2_n980PartLinTip[0] ;
         A979PartLin = P02HO2_A979PartLin[0] ;
         if ( P02HO2_A981PartAlbDis[0] == A981PartAlbDis )
         {
            /* Using cursor P02HO3 */
            pr_default.execute(1, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
            A972PartULin = P02HO3_A972PartULin[0] ;
            n972PartULin = P02HO3_n972PartULin[0] ;
            if ( GXutil.strcmp(A980PartLinTip, httpContext.getMessage( "D", "")) == 0 )
            {
               if ( A972PartULin == A979PartLin )
               {
                  A972PartULin = (int)(A979PartLin-1) ;
                  n972PartULin = false ;
               }
               /* Using cursor P02HO4 */
               pr_default.execute(2, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
               /* Using cursor P02HO5 */
               pr_default.execute(3, new Object[] {Boolean.valueOf(n972PartULin), Integer.valueOf(A972PartULin), A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      pr_default.close(1);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pdevpar.this.A396EmprCod;
      this.aP1[0] = pdevpar.this.A966PartCod;
      this.aP2[0] = pdevpar.this.A252CliCod;
      this.aP3[0] = pdevpar.this.A981PartAlbDis;
      Application.commitDataStores(context, remoteHandle, pr_default, "pdevpar");
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
      P02HO2_A396EmprCod = new String[] {""} ;
      P02HO2_A966PartCod = new String[] {""} ;
      P02HO2_A252CliCod = new int[1] ;
      P02HO2_A981PartAlbDis = new int[1] ;
      P02HO2_n981PartAlbDis = new boolean[] {false} ;
      P02HO2_A980PartLinTip = new String[] {""} ;
      P02HO2_n980PartLinTip = new boolean[] {false} ;
      P02HO2_A979PartLin = new int[1] ;
      A980PartLinTip = "" ;
      P02HO3_A972PartULin = new int[1] ;
      P02HO3_n972PartULin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pdevpar__default(),
         new Object[] {
             new Object[] {
            P02HO2_A396EmprCod, P02HO2_A966PartCod, P02HO2_A252CliCod, P02HO2_A981PartAlbDis, P02HO2_n981PartAlbDis, P02HO2_A980PartLinTip, P02HO2_n980PartLinTip, P02HO2_A979PartLin
            }
            , new Object[] {
            P02HO3_A972PartULin, P02HO3_n972PartULin
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

   private short Gx_err ;
   private int A252CliCod ;
   private int A981PartAlbDis ;
   private int A979PartLin ;
   private int A972PartULin ;
   private String A396EmprCod ;
   private String A966PartCod ;
   private String scmdbuf ;
   private String A980PartLinTip ;
   private boolean n981PartAlbDis ;
   private boolean n980PartLinTip ;
   private boolean n972PartULin ;
   private int[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02HO2_A396EmprCod ;
   private String[] P02HO2_A966PartCod ;
   private int[] P02HO2_A252CliCod ;
   private int[] P02HO2_A981PartAlbDis ;
   private boolean[] P02HO2_n981PartAlbDis ;
   private String[] P02HO2_A980PartLinTip ;
   private boolean[] P02HO2_n980PartLinTip ;
   private int[] P02HO2_A979PartLin ;
   private int[] P02HO3_A972PartULin ;
   private boolean[] P02HO3_n972PartULin ;
}

final  class pdevpar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02HO2", "SELECT EmprCod, PartCod, CliCod, PartAlbDis, PartLinTip, PartLin FROM TXPLPARTI WHERE (EmprCod = ? AND PartCod = ? AND CliCod = ?) AND ((EmprCod = ? and PartCod = ? and CliCod = ?) AND (PartAlbDis = ?)) ORDER BY EmprCod, PartCod, CliCod ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02HO3", "SELECT PartULin FROM TXPCPARTI WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02HO4", "DELETE FROM TXPLPARTI  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new UpdateCursor("P02HO5", "UPDATE TXPCPARTI SET PartULin=?  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
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
               ((String[]) buf[1])[0] = rslt.getString(2, 16);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((int[]) buf[7])[0] = rslt.getInt(6);
               return;
            case 1 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
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
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setString(4, (String)parms[3], 3);
               stmt.setString(5, (String)parms[4], 16);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(7, ((Number) parms[7]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 3 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(1, ((Number) parms[1]).intValue());
               }
               stmt.setString(2, (String)parms[2], 3);
               stmt.setString(3, (String)parms[3], 16);
               stmt.setInt(4, ((Number) parms[4]).intValue());
               return;
      }
   }

}

