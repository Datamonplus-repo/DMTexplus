package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcapfm1 extends GXProcedure
{
   public pcapfm1( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcapfm1.class ), "" );
   }

   public pcapfm1( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 )
   {
      pcapfm1.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        String[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             String[] aP4 ,
                             String[] aP5 )
   {
      pcapfm1.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcapfm1.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      pcapfm1.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      pcapfm1.this.A758ProCod = aP3[0];
      this.aP3 = aP3;
      pcapfm1.this.A9836FasCodM = aP4[0];
      this.aP4 = aP4;
      pcapfm1.this.AV8MaqCodc = aP5[0];
      this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8MaqCodc = "" ;
      /* Using cursor P05D22 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A9836FasCodM});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9830MaqCodC = P05D22_A9830MaqCodC[0] ;
         AV8MaqCodc = A9830MaqCodC ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pcapfm1.this.A396EmprCod;
      this.aP1[0] = pcapfm1.this.A252CliCod;
      this.aP2[0] = pcapfm1.this.A65ArtCod;
      this.aP3[0] = pcapfm1.this.A758ProCod;
      this.aP4[0] = pcapfm1.this.A9836FasCodM;
      this.aP5[0] = pcapfm1.this.AV8MaqCodc;
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
      P05D22_A396EmprCod = new String[] {""} ;
      P05D22_A252CliCod = new int[1] ;
      P05D22_A65ArtCod = new String[] {""} ;
      P05D22_A758ProCod = new String[] {""} ;
      P05D22_A9836FasCodM = new String[] {""} ;
      P05D22_A9830MaqCodC = new String[] {""} ;
      A9830MaqCodC = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcapfm1__default(),
         new Object[] {
             new Object[] {
            P05D22_A396EmprCod, P05D22_A252CliCod, P05D22_A65ArtCod, P05D22_A758ProCod, P05D22_A9836FasCodM, P05D22_A9830MaqCodC
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
   private String A758ProCod ;
   private String A9836FasCodM ;
   private String AV8MaqCodc ;
   private String scmdbuf ;
   private String A9830MaqCodC ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private String[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P05D22_A396EmprCod ;
   private int[] P05D22_A252CliCod ;
   private String[] P05D22_A65ArtCod ;
   private String[] P05D22_A758ProCod ;
   private String[] P05D22_A9836FasCodM ;
   private String[] P05D22_A9830MaqCodC ;
}

final  class pcapfm1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P05D22", "SELECT EmprCod, CliCod, ArtCod, ProCod, FasCodM, MaqCodC FROM TXPCAPFM1 WHERE EmprCod = ? and CliCod = ? and ArtCod = ? and ProCod = ? and FasCodM = ? ORDER BY EmprCod, CliCod, ArtCod, ProCod, FasCodM ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 8);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
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
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

