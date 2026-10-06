package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class agrupaciontinteoacabado extends GXProcedure
{
   public agrupaciontinteoacabado( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( agrupaciontinteoacabado.class ), "" );
   }

   public agrupaciontinteoacabado( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 )
   {
      agrupaciontinteoacabado.this.aP5 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
      return aP5[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        byte[] aP2 ,
                        String[] aP3 ,
                        byte[] aP4 ,
                        String[] aP5 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             byte[] aP2 ,
                             String[] aP3 ,
                             byte[] aP4 ,
                             String[] aP5 )
   {
      agrupaciontinteoacabado.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      agrupaciontinteoacabado.this.A4492HreBarCod = aP1[0];
      this.aP1 = aP1;
      agrupaciontinteoacabado.this.A4493HreBarReo = aP2[0];
      this.aP2 = aP2;
      agrupaciontinteoacabado.this.A4494HreBarPar = aP3[0];
      this.aP3 = aP3;
      agrupaciontinteoacabado.this.A4495HreNumCie = aP4[0];
      this.aP4 = aP4;
      agrupaciontinteoacabado.this.aP5 = aP5;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8BarAGrest = "N" ;
      /* Using cursor P09FI2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9808HreRacab = P09FI2_A9808HreRacab[0] ;
         n9808HreRacab = P09FI2_n9808HreRacab[0] ;
         AV9ToA = ((GXutil.strcmp("", A9808HreRacab)==0) ? "T" : "A") ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      if ( GXutil.strcmp(AV9ToA, "T") == 0 )
      {
         /* Using cursor P09FI3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A4497HreAgrCod = P09FI3_A4497HreAgrCod[0] ;
            A4498HreAgrReo = P09FI3_A4498HreAgrReo[0] ;
            A4499HreAgrPar = P09FI3_A4499HreAgrPar[0] ;
            AV8BarAGrest = "S" ;
            pr_default.readNext(1);
         }
         pr_default.close(1);
      }
      else
      {
         /* Using cursor P09FI4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A4492HreBarCod), Byte.valueOf(A4493HreBarReo), A4494HreBarPar, Byte.valueOf(A4495HreNumCie)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A9985HreAcCod = P09FI4_A9985HreAcCod[0] ;
            A9986HreAcReo = P09FI4_A9986HreAcReo[0] ;
            A9987HreAcPar = P09FI4_A9987HreAcPar[0] ;
            AV8BarAGrest = "S" ;
            pr_default.readNext(2);
         }
         pr_default.close(2);
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = agrupaciontinteoacabado.this.A396EmprCod;
      this.aP1[0] = agrupaciontinteoacabado.this.A4492HreBarCod;
      this.aP2[0] = agrupaciontinteoacabado.this.A4493HreBarReo;
      this.aP3[0] = agrupaciontinteoacabado.this.A4494HreBarPar;
      this.aP4[0] = agrupaciontinteoacabado.this.A4495HreNumCie;
      this.aP5[0] = agrupaciontinteoacabado.this.AV8BarAGrest;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8BarAGrest = "" ;
      scmdbuf = "" ;
      P09FI2_A396EmprCod = new String[] {""} ;
      P09FI2_A4492HreBarCod = new int[1] ;
      P09FI2_A4493HreBarReo = new byte[1] ;
      P09FI2_A4494HreBarPar = new String[] {""} ;
      P09FI2_A4495HreNumCie = new byte[1] ;
      P09FI2_A9808HreRacab = new String[] {""} ;
      P09FI2_n9808HreRacab = new boolean[] {false} ;
      A9808HreRacab = "" ;
      AV9ToA = "" ;
      P09FI3_A396EmprCod = new String[] {""} ;
      P09FI3_A4492HreBarCod = new int[1] ;
      P09FI3_A4493HreBarReo = new byte[1] ;
      P09FI3_A4494HreBarPar = new String[] {""} ;
      P09FI3_A4495HreNumCie = new byte[1] ;
      P09FI3_A4497HreAgrCod = new int[1] ;
      P09FI3_A4498HreAgrReo = new byte[1] ;
      P09FI3_A4499HreAgrPar = new String[] {""} ;
      A4499HreAgrPar = "" ;
      P09FI4_A396EmprCod = new String[] {""} ;
      P09FI4_A4492HreBarCod = new int[1] ;
      P09FI4_A4493HreBarReo = new byte[1] ;
      P09FI4_A4494HreBarPar = new String[] {""} ;
      P09FI4_A4495HreNumCie = new byte[1] ;
      P09FI4_A9985HreAcCod = new int[1] ;
      P09FI4_A9986HreAcReo = new byte[1] ;
      P09FI4_A9987HreAcPar = new String[] {""} ;
      A9987HreAcPar = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.agrupaciontinteoacabado__default(),
         new Object[] {
             new Object[] {
            P09FI2_A396EmprCod, P09FI2_A4492HreBarCod, P09FI2_A4493HreBarReo, P09FI2_A4494HreBarPar, P09FI2_A4495HreNumCie, P09FI2_A9808HreRacab, P09FI2_n9808HreRacab
            }
            , new Object[] {
            P09FI3_A396EmprCod, P09FI3_A4492HreBarCod, P09FI3_A4493HreBarReo, P09FI3_A4494HreBarPar, P09FI3_A4495HreNumCie, P09FI3_A4497HreAgrCod, P09FI3_A4498HreAgrReo, P09FI3_A4499HreAgrPar
            }
            , new Object[] {
            P09FI4_A396EmprCod, P09FI4_A4492HreBarCod, P09FI4_A4493HreBarReo, P09FI4_A4494HreBarPar, P09FI4_A4495HreNumCie, P09FI4_A9985HreAcCod, P09FI4_A9986HreAcReo, P09FI4_A9987HreAcPar
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A4493HreBarReo ;
   private byte A4495HreNumCie ;
   private byte A4498HreAgrReo ;
   private byte A9986HreAcReo ;
   private short Gx_err ;
   private int A4492HreBarCod ;
   private int A4497HreAgrCod ;
   private int A9985HreAcCod ;
   private String A396EmprCod ;
   private String A4494HreBarPar ;
   private String AV8BarAGrest ;
   private String scmdbuf ;
   private String A9808HreRacab ;
   private String AV9ToA ;
   private String A4499HreAgrPar ;
   private String A9987HreAcPar ;
   private boolean n9808HreRacab ;
   private String[] aP5 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private byte[] aP2 ;
   private String[] aP3 ;
   private byte[] aP4 ;
   private IDataStoreProvider pr_default ;
   private String[] P09FI2_A396EmprCod ;
   private int[] P09FI2_A4492HreBarCod ;
   private byte[] P09FI2_A4493HreBarReo ;
   private String[] P09FI2_A4494HreBarPar ;
   private byte[] P09FI2_A4495HreNumCie ;
   private String[] P09FI2_A9808HreRacab ;
   private boolean[] P09FI2_n9808HreRacab ;
   private String[] P09FI3_A396EmprCod ;
   private int[] P09FI3_A4492HreBarCod ;
   private byte[] P09FI3_A4493HreBarReo ;
   private String[] P09FI3_A4494HreBarPar ;
   private byte[] P09FI3_A4495HreNumCie ;
   private int[] P09FI3_A4497HreAgrCod ;
   private byte[] P09FI3_A4498HreAgrReo ;
   private String[] P09FI3_A4499HreAgrPar ;
   private String[] P09FI4_A396EmprCod ;
   private int[] P09FI4_A4492HreBarCod ;
   private byte[] P09FI4_A4493HreBarReo ;
   private String[] P09FI4_A4494HreBarPar ;
   private byte[] P09FI4_A4495HreNumCie ;
   private int[] P09FI4_A9985HreAcCod ;
   private byte[] P09FI4_A9986HreAcReo ;
   private String[] P09FI4_A9987HreAcPar ;
}

final  class agrupaciontinteoacabado__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09FI2", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreRacab FROM TXPHISREH WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("P09FI3", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod, HreAgrReo, HreAgrPar FROM TXPHISRAG WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAgrCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P09FI4", "SELECT EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod, HreAcReo, HreAcPar FROM TXPHISHRA WHERE EmprCod = ? and HreBarCod = ? and HreBarReo = ? and HreBarPar = ? and HreNumCie = ? ORDER BY EmprCod, HreBarCod, HreBarReo, HreBarPar, HreNumCie, HreAcCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 1);
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
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setByte(5, ((Number) parms[4]).byteValue());
               return;
      }
   }

}

