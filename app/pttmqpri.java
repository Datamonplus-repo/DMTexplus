package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pttmqpri extends GXProcedure
{
   public pttmqpri( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pttmqpri.class ), "" );
   }

   public pttmqpri( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            String[] aP2 )
   {
      pttmqpri.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        String[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             String[] aP2 ,
                             short[] aP3 )
   {
      pttmqpri.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pttmqpri.this.A1514MacProCod = aP1[0];
      this.aP1 = aP1;
      pttmqpri.this.AV12BarMaqCod = aP2[0];
      this.aP2 = aP2;
      pttmqpri.this.AV8TiempoT = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8TiempoT = (short)(0) ;
      AV14Maq_Tt = (short)(0) ;
      /* Using cursor P03FH2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV12BarMaqCod, AV13Macprocod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A8008Maq_Prg = P03FH2_A8008Maq_Prg[0] ;
         A602MaqCod = P03FH2_A602MaqCod[0] ;
         A8007Maq_Tt = P03FH2_A8007Maq_Tt[0] ;
         n8007Maq_Tt = P03FH2_n8007Maq_Tt[0] ;
         AV14Maq_Tt = A8007Maq_Tt ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(0);
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pttmqpri.this.A396EmprCod;
      this.aP1[0] = pttmqpri.this.A1514MacProCod;
      this.aP2[0] = pttmqpri.this.AV12BarMaqCod;
      this.aP3[0] = pttmqpri.this.AV8TiempoT;
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
      AV13Macprocod = "" ;
      P03FH2_A396EmprCod = new String[] {""} ;
      P03FH2_A8008Maq_Prg = new String[] {""} ;
      P03FH2_A602MaqCod = new String[] {""} ;
      P03FH2_A8007Maq_Tt = new short[1] ;
      P03FH2_n8007Maq_Tt = new boolean[] {false} ;
      A8008Maq_Prg = "" ;
      A602MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pttmqpri__default(),
         new Object[] {
             new Object[] {
            P03FH2_A396EmprCod, P03FH2_A8008Maq_Prg, P03FH2_A602MaqCod, P03FH2_A8007Maq_Tt, P03FH2_n8007Maq_Tt
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV8TiempoT ;
   private short AV14Maq_Tt ;
   private short A8007Maq_Tt ;
   private short Gx_err ;
   private String A396EmprCod ;
   private String A1514MacProCod ;
   private String AV12BarMaqCod ;
   private String scmdbuf ;
   private String AV13Macprocod ;
   private String A8008Maq_Prg ;
   private String A602MaqCod ;
   private boolean n8007Maq_Tt ;
   private short[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private String[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P03FH2_A396EmprCod ;
   private String[] P03FH2_A8008Maq_Prg ;
   private String[] P03FH2_A602MaqCod ;
   private short[] P03FH2_A8007Maq_Tt ;
   private boolean[] P03FH2_n8007Maq_Tt ;
}

final  class pttmqpri__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P03FH2", "SELECT EmprCod, Maq_Prg, MaqCod, Maq_Tt FROM TXPMAQPRG WHERE EmprCod = ? and MaqCod = ? and Maq_Prg = ? ORDER BY EmprCod, MaqCod, Maq_Prg ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setString(2, (String)parms[1], 6);
               stmt.setString(3, (String)parms[2], 6);
               return;
      }
   }

}

