package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pbusdis extends GXProcedure
{
   public pbusdis( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pbusdis.class ), "" );
   }

   public pbusdis( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 )
   {
      pbusdis.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 )
   {
      pbusdis.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pbusdis.this.AV18Procod = aP1[0];
      this.aP1 = aP1;
      pbusdis.this.AV19FasCod = aP2[0];
      this.aP2 = aP2;
      pbusdis.this.AV20Msg_err = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV20Msg_err = " " ;
      AV23GXLvl4 = (byte)(0) ;
      /* Using cursor P000Q2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV18Procod, AV19FasCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A457FasCod = P000Q2_A457FasCod[0] ;
         A758ProCod = P000Q2_A758ProCod[0] ;
         A5735ProFasNot = P000Q2_A5735ProFasNot[0] ;
         n5735ProFasNot = P000Q2_n5735ProFasNot[0] ;
         A774ProNumLin = P000Q2_A774ProNumLin[0] ;
         AV23GXLvl4 = (byte)(1) ;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      if ( AV23GXLvl4 == 0 )
      {
         AV20Msg_err = httpContext.getMessage( "ERROR.No existe esta FASE en este PROCESO ¡¡¡", "") ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pbusdis.this.A396EmprCod;
      this.aP1[0] = pbusdis.this.AV18Procod;
      this.aP2[0] = pbusdis.this.AV19FasCod;
      this.aP3[0] = pbusdis.this.AV20Msg_err;
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
      P000Q2_A396EmprCod = new String[] {""} ;
      P000Q2_A457FasCod = new String[] {""} ;
      P000Q2_A758ProCod = new String[] {""} ;
      P000Q2_A5735ProFasNot = new String[] {""} ;
      P000Q2_n5735ProFasNot = new boolean[] {false} ;
      P000Q2_A774ProNumLin = new short[1] ;
      A457FasCod = "" ;
      A758ProCod = "" ;
      A5735ProFasNot = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pbusdis__default(),
         new Object[] {
             new Object[] {
            P000Q2_A396EmprCod, P000Q2_A457FasCod, P000Q2_A758ProCod, P000Q2_A5735ProFasNot, P000Q2_n5735ProFasNot, P000Q2_A774ProNumLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV23GXLvl4 ;
   private short A774ProNumLin ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String AV18Procod ;
   private String AV19FasCod ;
   private String AV20Msg_err ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A758ProCod ;
   private boolean n5735ProFasNot ;
   private String A5735ProFasNot ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P000Q2_A396EmprCod ;
   private String[] P000Q2_A457FasCod ;
   private String[] P000Q2_A758ProCod ;
   private String[] P000Q2_A5735ProFasNot ;
   private boolean[] P000Q2_n5735ProFasNot ;
   private short[] P000Q2_A774ProNumLin ;
}

final  class pbusdis__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P000Q2", "SELECT EmprCod, FasCod, ProCod, ProFasNot, ProNumLin FROM TXPPROLIN WHERE (EmprCod = ? and ProCod = ?) AND (FasCod = ?) ORDER BY EmprCod, ProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((short[]) buf[5])[0] = rslt.getShort(5);
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
               stmt.setString(2, (String)parms[1], 8);
               stmt.setString(3, (String)parms[2], 8);
               return;
      }
   }

}

