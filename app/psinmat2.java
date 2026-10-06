package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class psinmat2 extends GXProcedure
{
   public psinmat2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( psinmat2.class ), "" );
   }

   public psinmat2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 )
   {
      psinmat2.this.aP1 = new int[] {0};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 )
   {
      psinmat2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      psinmat2.this.AV11Clicod = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      Gx_msg = httpContext.getMessage( "&Clicod=", "") + GXutil.str( AV11Clicod, 10, 0) + GXutil.chr( (short)(13)) ;
      System.out.println( Gx_msg );
      /* Using cursor P044E2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV11Clicod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P044E2_A252CliCod[0] ;
         A966PartCod = P044E2_A966PartCod[0] ;
         A981PartAlbDis = P044E2_A981PartAlbDis[0] ;
         n981PartAlbDis = P044E2_n981PartAlbDis[0] ;
         A979PartLin = P044E2_A979PartLin[0] ;
         if ( GXutil.strcmp(A966PartCod, httpContext.getMessage( "SIN MATERIA", "")) == 0 )
         {
            AV12Discod = A981PartAlbDis ;
            /* Execute user subroutine: 'DISPOS' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
            if ( AV13Dispos == 0 )
            {
               /* Using cursor P044E3 */
               pr_default.execute(1, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Integer.valueOf(A979PartLin)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPLPARTI");
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   public void S111( )
   {
      /* 'DISPOS' Routine */
      returnInSub = false ;
      AV13Dispos = (byte)(0) ;
      /* Using cursor P044E4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV12Discod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A361DisCod = P044E4_A361DisCod[0] ;
         AV13Dispos = (byte)(1) ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP0[0] = psinmat2.this.A396EmprCod;
      this.aP1[0] = psinmat2.this.AV11Clicod;
      Application.commitDataStores(context, remoteHandle, pr_default, "psinmat2");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      Gx_msg = "" ;
      scmdbuf = "" ;
      P044E2_A396EmprCod = new String[] {""} ;
      P044E2_A252CliCod = new int[1] ;
      P044E2_A966PartCod = new String[] {""} ;
      P044E2_A981PartAlbDis = new int[1] ;
      P044E2_n981PartAlbDis = new boolean[] {false} ;
      P044E2_A979PartLin = new int[1] ;
      A966PartCod = "" ;
      P044E4_A396EmprCod = new String[] {""} ;
      P044E4_A361DisCod = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.psinmat2__default(),
         new Object[] {
             new Object[] {
            P044E2_A396EmprCod, P044E2_A252CliCod, P044E2_A966PartCod, P044E2_A981PartAlbDis, P044E2_n981PartAlbDis, P044E2_A979PartLin
            }
            , new Object[] {
            }
            , new Object[] {
            P044E4_A396EmprCod, P044E4_A361DisCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV13Dispos ;
   private short Gx_err ;
   private int AV11Clicod ;
   private int A252CliCod ;
   private int A981PartAlbDis ;
   private int A979PartLin ;
   private int AV12Discod ;
   private int A361DisCod ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A966PartCod ;
   private boolean n981PartAlbDis ;
   private boolean returnInSub ;
   private int[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P044E2_A396EmprCod ;
   private int[] P044E2_A252CliCod ;
   private String[] P044E2_A966PartCod ;
   private int[] P044E2_A981PartAlbDis ;
   private boolean[] P044E2_n981PartAlbDis ;
   private int[] P044E2_A979PartLin ;
   private String[] P044E4_A396EmprCod ;
   private int[] P044E4_A361DisCod ;
}

final  class psinmat2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P044E2", "SELECT EmprCod, CliCod, PartCod, PartAlbDis, PartLin FROM TXPLPARTI WHERE (EmprCod = ?) AND (CliCod = ?) ORDER BY EmprCod, PartCod, CliCod, PartLin ",true, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P044E3", "DELETE FROM TXPLPARTI  WHERE EmprCod = ? AND PartCod = ? AND CliCod = ? AND PartLin = ?", GX_NOMASK + GX_MASKLOOPLOCK, "TXPLPARTI")
         ,new ForEachCursor("P044E4", "SELECT EmprCod, DisCod FROM TXPDISPOS WHERE EmprCod = ? and DisCod = ? ORDER BY EmprCod, DisCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 16);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((int[]) buf[5])[0] = rslt.getInt(5);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

