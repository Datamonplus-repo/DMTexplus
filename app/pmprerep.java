package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pmprerep extends GXProcedure
{
   public pmprerep( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pmprerep.class ), "" );
   }

   public pmprerep( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public int executeUdp( String[] aP0 ,
                          int[] aP1 )
   {
      pmprerep.this.aP2 = new int[] {0};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        int[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             int[] aP2 )
   {
      pmprerep.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pmprerep.this.AV8PMCod = aP1[0];
      this.aP1 = aP1;
      pmprerep.this.AV9TMCod = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /* Using cursor P03YY2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(AV9TMCod)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A9525TMRepCod = P03YY2_A9525TMRepCod[0] ;
         A9527TMRepCnt = P03YY2_A9527TMRepCnt[0] ;
         A9430TMCod = P03YY2_A9430TMCod[0] ;
         /*
            INSERT RECORD ON TABLE TXPMPreRe

         */
         A9429PMCod = AV8PMCod ;
         A9489PMRepCod = A9525TMRepCod ;
         A9491PMRRCnt = A9527TMRepCnt ;
         /* Using cursor P03YY3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A9429PMCod), Integer.valueOf(A9489PMRepCod), A9491PMRRCnt});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPMPreRe");
         if ( (pr_default.getStatus(1) == 1) )
         {
            Gx_err = (short)(1) ;
            Gx_emsg = localUtil.getMessages().getMessage("GXM_noupdate") ;
         }
         else
         {
            Gx_err = (short)(0) ;
            Gx_emsg = "" ;
         }
         /* End Insert */
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pmprerep.this.A396EmprCod;
      this.aP1[0] = pmprerep.this.AV8PMCod;
      this.aP2[0] = pmprerep.this.AV9TMCod;
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
      P03YY2_A396EmprCod = new String[] {""} ;
      P03YY2_A9525TMRepCod = new int[1] ;
      P03YY2_A9527TMRepCnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P03YY2_A9430TMCod = new int[1] ;
      A9527TMRepCnt = DecimalUtil.ZERO ;
      A9491PMRRCnt = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pmprerep__default(),
         new Object[] {
             new Object[] {
            P03YY2_A396EmprCod, P03YY2_A9525TMRepCod, P03YY2_A9527TMRepCnt, P03YY2_A9430TMCod
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private int AV8PMCod ;
   private int AV9TMCod ;
   private int A9525TMRepCod ;
   private int A9430TMCod ;
   private int GX_INS1237 ;
   private int A9429PMCod ;
   private int A9489PMRepCod ;
   private java.math.BigDecimal A9527TMRepCnt ;
   private java.math.BigDecimal A9491PMRRCnt ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String Gx_emsg ;
   private int[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
   private String[] P03YY2_A396EmprCod ;
   private int[] P03YY2_A9525TMRepCod ;
   private java.math.BigDecimal[] P03YY2_A9527TMRepCnt ;
   private int[] P03YY2_A9430TMCod ;
}

final  class pmprerep__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03YY2", "SELECT EmprCod, TMRepCod, TMRepCnt, TMCod FROM TXPMTaRep WHERE EmprCod = ? and TMCod = ? ORDER BY EmprCod, TMCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P03YY3", "INSERT INTO TXPMPreRe(EmprCod, PMCod, PMRepCod, PMRRCnt) VALUES(?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPMPreRe")
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
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setBigDecimal(4, (java.math.BigDecimal)parms[3], 3);
               return;
      }
   }

}

