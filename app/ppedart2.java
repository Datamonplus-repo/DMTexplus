package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ppedart2 extends GXProcedure
{
   public ppedart2( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ppedart2.class ), "" );
   }

   public ppedart2( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            int[] aP1 ,
                            String[] aP2 ,
                            java.math.BigDecimal[] aP3 ,
                            short[] aP4 ,
                            short[] aP5 ,
                            String[] aP6 )
   {
      ppedart2.this.aP7 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
      return aP7[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        java.math.BigDecimal[] aP3 ,
                        short[] aP4 ,
                        short[] aP5 ,
                        String[] aP6 ,
                        short[] aP7 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6, aP7);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             java.math.BigDecimal[] aP3 ,
                             short[] aP4 ,
                             short[] aP5 ,
                             String[] aP6 ,
                             short[] aP7 )
   {
      ppedart2.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      ppedart2.this.A252CliCod = aP1[0];
      this.aP1 = aP1;
      ppedart2.this.A65ArtCod = aP2[0];
      this.aP2 = aP2;
      ppedart2.this.AV12PArArtRdo = aP3[0];
      this.aP3 = aP3;
      ppedart2.this.AV11PArArtAnc = aP4[0];
      this.aP4 = aP4;
      ppedart2.this.AV10PArArtGrm = aP5[0];
      this.aP5 = aP5;
      ppedart2.this.AV9PArArtOriC = aP6[0];
      this.aP6 = aP6;
      ppedart2.this.AV8PArArtPML = aP7[0];
      this.aP7 = aP7;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P037F2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A95ArtRen = P037F2_A95ArtRen[0] ;
         n95ArtRen = P037F2_n95ArtRen[0] ;
         A63ArtAcaMin = P037F2_A63ArtAcaMin[0] ;
         n63ArtAcaMin = P037F2_n63ArtAcaMin[0] ;
         A1903ArtGraAca = P037F2_A1903ArtGraAca[0] ;
         n1903ArtGraAca = P037F2_n1903ArtGraAca[0] ;
         A70ArtEncOri = P037F2_A70ArtEncOri[0] ;
         n70ArtEncOri = P037F2_n70ArtEncOri[0] ;
         A1148ArtPml = P037F2_A1148ArtPml[0] ;
         n1148ArtPml = P037F2_n1148ArtPml[0] ;
         AV12PArArtRdo = A95ArtRen ;
         AV11PArArtAnc = A63ArtAcaMin ;
         AV10PArArtGrm = A1903ArtGraAca ;
         AV9PArArtOriC = A70ArtEncOri ;
         AV8PArArtPML = A1148ArtPml ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = ppedart2.this.A396EmprCod;
      this.aP1[0] = ppedart2.this.A252CliCod;
      this.aP2[0] = ppedart2.this.A65ArtCod;
      this.aP3[0] = ppedart2.this.AV12PArArtRdo;
      this.aP4[0] = ppedart2.this.AV11PArArtAnc;
      this.aP5[0] = ppedart2.this.AV10PArArtGrm;
      this.aP6[0] = ppedart2.this.AV9PArArtOriC;
      this.aP7[0] = ppedart2.this.AV8PArArtPML;
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
      P037F2_A396EmprCod = new String[] {""} ;
      P037F2_A252CliCod = new int[1] ;
      P037F2_A65ArtCod = new String[] {""} ;
      P037F2_A95ArtRen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P037F2_n95ArtRen = new boolean[] {false} ;
      P037F2_A63ArtAcaMin = new short[1] ;
      P037F2_n63ArtAcaMin = new boolean[] {false} ;
      P037F2_A1903ArtGraAca = new short[1] ;
      P037F2_n1903ArtGraAca = new boolean[] {false} ;
      P037F2_A70ArtEncOri = new String[] {""} ;
      P037F2_n70ArtEncOri = new boolean[] {false} ;
      P037F2_A1148ArtPml = new short[1] ;
      P037F2_n1148ArtPml = new boolean[] {false} ;
      A95ArtRen = DecimalUtil.ZERO ;
      A70ArtEncOri = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ppedart2__default(),
         new Object[] {
             new Object[] {
            P037F2_A396EmprCod, P037F2_A252CliCod, P037F2_A65ArtCod, P037F2_A95ArtRen, P037F2_n95ArtRen, P037F2_A63ArtAcaMin, P037F2_n63ArtAcaMin, P037F2_A1903ArtGraAca, P037F2_n1903ArtGraAca, P037F2_A70ArtEncOri,
            P037F2_n70ArtEncOri, P037F2_A1148ArtPml, P037F2_n1148ArtPml
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11PArArtAnc ;
   private short AV10PArArtGrm ;
   private short AV8PArArtPML ;
   private short A63ArtAcaMin ;
   private short A1903ArtGraAca ;
   private short A1148ArtPml ;
   private short Gx_err ;
   private int A252CliCod ;
   private java.math.BigDecimal AV12PArArtRdo ;
   private java.math.BigDecimal A95ArtRen ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String AV9PArArtOriC ;
   private String scmdbuf ;
   private String A70ArtEncOri ;
   private boolean n95ArtRen ;
   private boolean n63ArtAcaMin ;
   private boolean n1903ArtGraAca ;
   private boolean n70ArtEncOri ;
   private boolean n1148ArtPml ;
   private short[] aP7 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private java.math.BigDecimal[] aP3 ;
   private short[] aP4 ;
   private short[] aP5 ;
   private String[] aP6 ;
   private IDataStoreProvider pr_default ;
   private String[] P037F2_A396EmprCod ;
   private int[] P037F2_A252CliCod ;
   private String[] P037F2_A65ArtCod ;
   private java.math.BigDecimal[] P037F2_A95ArtRen ;
   private boolean[] P037F2_n95ArtRen ;
   private short[] P037F2_A63ArtAcaMin ;
   private boolean[] P037F2_n63ArtAcaMin ;
   private short[] P037F2_A1903ArtGraAca ;
   private boolean[] P037F2_n1903ArtGraAca ;
   private String[] P037F2_A70ArtEncOri ;
   private boolean[] P037F2_n70ArtEncOri ;
   private short[] P037F2_A1148ArtPml ;
   private boolean[] P037F2_n1148ArtPml ;
}

final  class ppedart2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P037F2", "SELECT EmprCod, CliCod, ArtCod, ArtRen, ArtAcaMin, ArtGraAca, ArtEncOri, ArtPml FROM TXPARTICU WHERE EmprCod = ? and CliCod = ? and ArtCod = ? ORDER BY EmprCod, CliCod, ArtCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((short[]) buf[7])[0] = rslt.getShort(6);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((short[]) buf[11])[0] = rslt.getShort(8);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
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

