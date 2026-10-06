package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pclinom extends GXProcedure
{
   public pclinom( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pclinom.class ), "" );
   }

   public pclinom( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             int aP1 )
   {
      pclinom.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String aP0 ,
                        int aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String aP0 ,
                             int aP1 ,
                             String[] aP2 )
   {
      pclinom.this.AV17EmprCod = aP0;
      pclinom.this.AV16CliCod = aP1;
      pclinom.this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV15CliNom = "" ;
      AV20GXLvl2 = (byte)(0) ;
      /* Using cursor P003Q2 */
      pr_default.execute(0, new Object[] {AV17EmprCod, Integer.valueOf(AV16CliCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = P003Q2_A252CliCod[0] ;
         A396EmprCod = P003Q2_A396EmprCod[0] ;
         A279CliNom = P003Q2_A279CliNom[0] ;
         AV20GXLvl2 = (byte)(1) ;
         AV15CliNom = A279CliNom ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( AV20GXLvl2 == 0 )
      {
         AV15CliNom = (!(GXutil.strcmp("", AV15CliNom)==0) ? httpContext.getMessage( "Error", "") : AV15CliNom) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = pclinom.this.AV15CliNom;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV15CliNom = "" ;
      scmdbuf = "" ;
      P003Q2_A252CliCod = new int[1] ;
      P003Q2_A396EmprCod = new String[] {""} ;
      P003Q2_A279CliNom = new String[] {""} ;
      A396EmprCod = "" ;
      A279CliNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pclinom__default(),
         new Object[] {
             new Object[] {
            P003Q2_A252CliCod, P003Q2_A396EmprCod, P003Q2_A279CliNom
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV20GXLvl2 ;
   private short Gx_err ;
   private int AV16CliCod ;
   private int A252CliCod ;
   private String AV17EmprCod ;
   private String AV15CliNom ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A279CliNom ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private int[] P003Q2_A252CliCod ;
   private String[] P003Q2_A396EmprCod ;
   private String[] P003Q2_A279CliNom ;
}

final  class pclinom__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P003Q2", "SELECT CliCod, EmprCod, CliNom FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
      }
   }

}

