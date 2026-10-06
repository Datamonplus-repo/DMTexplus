package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class procesoquimico_lineaanterior extends GXProcedure
{
   public procesoquimico_lineaanterior( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( procesoquimico_lineaanterior.class ), "" );
   }

   public procesoquimico_lineaanterior( int remoteHandle ,
                                        ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 )
   {
      procesoquimico_lineaanterior.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      procesoquimico_lineaanterior.this.AV10Emprcod = aP0[0];
      this.aP0 = aP0;
      procesoquimico_lineaanterior.this.AV11Proforcod = aP1[0];
      this.aP1 = aP1;
      procesoquimico_lineaanterior.this.AV8Proforlin = aP2[0];
      this.aP2 = aP2;
      procesoquimico_lineaanterior.this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV9Proforprd = "" ;
      /* Using cursor P09TA2 */
      pr_default.execute(0, new Object[] {AV10Emprcod, AV11Proforcod, Short.valueOf(AV8Proforlin)});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A396EmprCod = P09TA2_A396EmprCod[0] ;
         A764ProForCod = P09TA2_A764ProForCod[0] ;
         A767ProForLin = P09TA2_A767ProForLin[0] ;
         A770ProForPrd = P09TA2_A770ProForPrd[0] ;
         AV9Proforprd = A770ProForPrd ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(0);
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = procesoquimico_lineaanterior.this.AV10Emprcod;
      this.aP1[0] = procesoquimico_lineaanterior.this.AV11Proforcod;
      this.aP2[0] = procesoquimico_lineaanterior.this.AV8Proforlin;
      this.aP3[0] = procesoquimico_lineaanterior.this.AV9Proforprd;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV9Proforprd = "" ;
      scmdbuf = "" ;
      P09TA2_A396EmprCod = new String[] {""} ;
      P09TA2_A764ProForCod = new String[] {""} ;
      P09TA2_A767ProForLin = new short[1] ;
      P09TA2_A770ProForPrd = new String[] {""} ;
      A396EmprCod = "" ;
      A764ProForCod = "" ;
      A770ProForPrd = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.procesoquimico_lineaanterior__default(),
         new Object[] {
             new Object[] {
            P09TA2_A396EmprCod, P09TA2_A764ProForCod, P09TA2_A767ProForLin, P09TA2_A770ProForPrd
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8Proforlin ;
   private short A767ProForLin ;
   private short Gx_err ;
   private String AV10Emprcod ;
   private String AV11Proforcod ;
   private String AV9Proforprd ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A764ProForCod ;
   private String A770ProForPrd ;
   private String[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P09TA2_A396EmprCod ;
   private String[] P09TA2_A764ProForCod ;
   private short[] P09TA2_A767ProForLin ;
   private String[] P09TA2_A770ProForPrd ;
}

final  class procesoquimico_lineaanterior__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P09TA2", "SELECT * FROM (SELECT EmprCod, ProForCod, ProForLin, ProForPrd FROM TXPLPROFO WHERE EmprCod = ? and ProForCod = ? and ProForLin < ? ORDER BY EmprCod, ProForCod, ProForLin DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               return;
      }
   }

}

