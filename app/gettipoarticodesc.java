package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class gettipoarticodesc extends GXProcedure
{
   public gettipoarticodesc( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( gettipoarticodesc.class ), "" );
   }

   public gettipoarticodesc( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 ,
                             String aP2 )
   {
      gettipoarticodesc.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String aP2 ,
                             String[] aP3 )
   {
      gettipoarticodesc.this.AV59EmprCod = aP0;
      gettipoarticodesc.this.AV60CliCod = aP1;
      gettipoarticodesc.this.AV61ArtCod = aP2;
      gettipoarticodesc.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV67GXLvl6 = (byte)(0) ;
      /* Using cursor P0AKG2 */
      pr_default.execute(0, new Object[] {AV59EmprCod, Integer.valueOf(AV60CliCod), AV61ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A65ArtCod = P0AKG2_A65ArtCod[0] ;
         A252CliCod = P0AKG2_A252CliCod[0] ;
         A396EmprCod = P0AKG2_A396EmprCod[0] ;
         A829TipArtCod = P0AKG2_A829TipArtCod[0] ;
         A830TipArtDsc = P0AKG2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0AKG2_n830TipArtDsc[0] ;
         A830TipArtDsc = P0AKG2_A830TipArtDsc[0] ;
         n830TipArtDsc = P0AKG2_n830TipArtDsc[0] ;
         AV67GXLvl6 = (byte)(1) ;
         AV63TipArtCod = A829TipArtCod ;
         AV62TipArtDsc = A830TipArtDsc ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV67GXLvl6 == 0 )
      {
         new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).write(GXutil.format( httpContext.getMessage( "Register not found EmprdCod : %1 Clicod: %2 ArtCod: %3", ""), AV59EmprCod, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60CliCod), 6, 0), AV61ArtCod, "", "", "", "", "", ""), AV68Pgmname, (short)(20)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP3[0] = gettipoarticodesc.this.AV62TipArtDsc;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV62TipArtDsc = "" ;
      scmdbuf = "" ;
      P0AKG2_A65ArtCod = new String[] {""} ;
      P0AKG2_A252CliCod = new int[1] ;
      P0AKG2_A396EmprCod = new String[] {""} ;
      P0AKG2_A829TipArtCod = new short[1] ;
      P0AKG2_A830TipArtDsc = new String[] {""} ;
      P0AKG2_n830TipArtDsc = new boolean[] {false} ;
      A65ArtCod = "" ;
      A396EmprCod = "" ;
      A830TipArtDsc = "" ;
      AV68Pgmname = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.gettipoarticodesc__default(),
         new Object[] {
             new Object[] {
            P0AKG2_A65ArtCod, P0AKG2_A252CliCod, P0AKG2_A396EmprCod, P0AKG2_A829TipArtCod, P0AKG2_A830TipArtDsc, P0AKG2_n830TipArtDsc
            }
         }
      );
      AV68Pgmname = "GetTipoArticoDesc" ;
      /* GeneXus formulas. */
      AV68Pgmname = "GetTipoArticoDesc" ;
      Gx_err = (short)(0) ;
   }

   private byte AV67GXLvl6 ;
   private short A829TipArtCod ;
   private short AV63TipArtCod ;
   private short Gx_err ;
   private int AV60CliCod ;
   private int A252CliCod ;
   private String AV59EmprCod ;
   private String AV61ArtCod ;
   private String AV62TipArtDsc ;
   private String scmdbuf ;
   private String A65ArtCod ;
   private String A396EmprCod ;
   private String A830TipArtDsc ;
   private String AV68Pgmname ;
   private boolean n830TipArtDsc ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P0AKG2_A65ArtCod ;
   private int[] P0AKG2_A252CliCod ;
   private String[] P0AKG2_A396EmprCod ;
   private short[] P0AKG2_A829TipArtCod ;
   private String[] P0AKG2_A830TipArtDsc ;
   private boolean[] P0AKG2_n830TipArtDsc ;
}

final  class gettipoarticodesc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0AKG2", "SELECT T1.ArtCod, T1.CliCod, T1.EmprCod, T1.TipArtCod, T2.TipArtDsc FROM (TXPARTICU T1 INNER JOIN TXPTIPART T2 ON T2.EmprCod = T1.EmprCod AND T2.TipArtCod = T1.TipArtCod) WHERE T1.EmprCod = ? and T1.CliCod = ? and T1.ArtCod = ? ORDER BY T1.EmprCod, T1.CliCod, T1.ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 16);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
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
               stmt.setString(3, (String)parms[2], 16);
               return;
      }
   }

}

