package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pfserie extends GXProcedure
{
   public pfserie( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pfserie.class ), "" );
   }

   public pfserie( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      pfserie.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pfserie.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pfserie.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pfserie.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pfserie.this.AV8Existe = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Existe = httpContext.getMessage( "N", "") ;
      /* Using cursor P00NA2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A63ArtAcaMin = P00NA2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P00NA2_n63ArtAcaMin[0] ;
         AV8Existe = httpContext.getMessage( "S", "") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pfserie.this.A396EmprCod;
      this.aP1[0] = pfserie.this.A252CliCod;
      this.aP2[0] = pfserie.this.A65ArtCod;
      this.aP3[0] = pfserie.this.AV8Existe;
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
      P00NA2_A396EmprCod = new String[] {""} ;
      P00NA2_A252CliCod = new int[1] ;
      P00NA2_A65ArtCod = new String[] {""} ;
      P00NA2_A63ArtAcaMin = new short[1] ;
      P00NA2_n63ArtAcaMin = new boolean[] {false} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pfserie__default(),
         new Object[] {
             new Object[] {
            P00NA2_A396EmprCod, P00NA2_A252CliCod, P00NA2_A65ArtCod, P00NA2_A63ArtAcaMin, P00NA2_n63ArtAcaMin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A63ArtAcaMin ;
   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV8Existe ;
   private String scmdbuf ;
   private boolean n63ArtAcaMin ;
   private String[] aP3 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P00NA2_A396EmprCod ;
   private int[] P00NA2_A252CliCod ;
   private String[] P00NA2_A65ArtCod ;
   private short[] P00NA2_A63ArtAcaMin ;
   private boolean[] P00NA2_n63ArtAcaMin ;
}

final  class pfserie__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P00NA2", "SELECT EmprCod, CliCod, ArtCod, ArtAcaMin FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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

