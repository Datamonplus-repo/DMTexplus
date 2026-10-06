package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pacamaracabak extends GXProcedure
{
   public pacamaracabak( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pacamaracabak.class ), "" );
   }

   public pacamaracabak( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pacamaracabak.this.aP4 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4);
      return aP4[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pacamaracabak.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pacamaracabak.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pacamaracabak.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pacamaracabak.this.AV8DisAcaBak = aP3[0];
      this.aP3 = aP3;
      pacamaracabak.this.AV9Disacamar = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8DisAcaBak = "" ;
      AV9Disacamar = "" ;
      /* Using cursor P05A62 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A4447ArtAcaBak = P05A62_A4447ArtAcaBak[0] ;
         n4447ArtAcaBak = P05A62_n4447ArtAcaBak[0] ;
         A4446ArtAcaMar = P05A62_A4446ArtAcaMar[0] ;
         n4446ArtAcaMar = P05A62_n4446ArtAcaMar[0] ;
         AV8DisAcaBak = A4447ArtAcaBak ;
         AV9Disacamar = A4446ArtAcaMar ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pacamaracabak.this.A396EmprCod;
      this.aP1[0] = pacamaracabak.this.A252CliCod;
      this.aP2[0] = pacamaracabak.this.A65ArtCod;
      this.aP3[0] = pacamaracabak.this.AV8DisAcaBak;
      this.aP4[0] = pacamaracabak.this.AV9Disacamar;
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
      P05A62_A396EmprCod = new String[] {""} ;
      P05A62_A252CliCod = new int[1] ;
      P05A62_A65ArtCod = new String[] {""} ;
      P05A62_A4447ArtAcaBak = new String[] {""} ;
      P05A62_n4447ArtAcaBak = new boolean[] {false} ;
      P05A62_A4446ArtAcaMar = new String[] {""} ;
      P05A62_n4446ArtAcaMar = new boolean[] {false} ;
      A4447ArtAcaBak = "" ;
      A4446ArtAcaMar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pacamaracabak__default(),
         new Object[] {
             new Object[] {
            P05A62_A396EmprCod, P05A62_A252CliCod, P05A62_A65ArtCod, P05A62_A4447ArtAcaBak, P05A62_n4447ArtAcaBak, P05A62_A4446ArtAcaMar, P05A62_n4446ArtAcaMar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int A252CliCod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV8DisAcaBak ;
   private String AV9Disacamar ;
   private String scmdbuf ;
   private String A4447ArtAcaBak ;
   private String A4446ArtAcaMar ;
   private boolean n4447ArtAcaBak ;
   private boolean n4446ArtAcaMar ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
   private String[] P05A62_A396EmprCod ;
   private int[] P05A62_A252CliCod ;
   private String[] P05A62_A65ArtCod ;
   private String[] P05A62_A4447ArtAcaBak ;
   private boolean[] P05A62_n4447ArtAcaBak ;
   private String[] P05A62_A4446ArtAcaMar ;
   private boolean[] P05A62_n4446ArtAcaMar ;
}

final  class pacamaracabak__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05A62", "SELECT EmprCod, CliCod, ArtCod, ArtAcaBak, ArtAcaMar FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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

