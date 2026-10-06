package app.ficherosbasicos ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class tproces_lineas_ins extends GXProcedure
{
   public tproces_lineas_ins( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( tproces_lineas_ins.class ), "" );
   }

   public tproces_lineas_ins( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String aP0 ,
                             String aP1 ,
                             short[] aP2 )
   {
      tproces_lineas_ins.this.aP3 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String aP0 ,
                        String aP1 ,
                        short[] aP2 ,
                        String[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String aP0 ,
                             String aP1 ,
                             short[] aP2 ,
                             String[] aP3 )
   {
      tproces_lineas_ins.this.AV8emprcod = aP0;
      tproces_lineas_ins.this.AV9Procod = aP1;
      tproces_lineas_ins.this.AV11Pronumlin = aP2[0];
      this.aP2 = aP2;
      tproces_lineas_ins.this.AV10Fascod = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPPROLIN

      */
      A396EmprCod = AV8emprcod ;
      A758ProCod = AV9Procod ;
      A774ProNumLin = AV11Pronumlin ;
      A457FasCod = AV10Fascod ;
      A5735ProFasNot = "" ;
      n5735ProFasNot = false ;
      A6437ProUltFP = (short)(0) ;
      A7892Dtp_FasDsc = "" ;
      n7892Dtp_FasDsc = false ;
      A7893Dtp_Tpp = DecimalUtil.ZERO ;
      n7893Dtp_Tpp = false ;
      A7894Dtp_H2OReh = "" ;
      n7894Dtp_H2OReh = false ;
      A7895Dtp_TpCost = (short)(0) ;
      n7895Dtp_TpCost = false ;
      A7896Dtp_UnpLt = DecimalUtil.ZERO ;
      n7896Dtp_UnpLt = false ;
      A7911Dtp_UOrd = (short)(0) ;
      n7911Dtp_UOrd = false ;
      /* Using cursor P0A9P2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A758ProCod, Short.valueOf(A774ProNumLin), A457FasCod, Boolean.valueOf(n5735ProFasNot), A5735ProFasNot, Short.valueOf(A6437ProUltFP), Boolean.valueOf(n7892Dtp_FasDsc), A7892Dtp_FasDsc, Boolean.valueOf(n7893Dtp_Tpp), A7893Dtp_Tpp, Boolean.valueOf(n7894Dtp_H2OReh), A7894Dtp_H2OReh, Boolean.valueOf(n7895Dtp_TpCost), Short.valueOf(A7895Dtp_TpCost), Boolean.valueOf(n7896Dtp_UnpLt), A7896Dtp_UnpLt, Boolean.valueOf(n7911Dtp_UOrd), Short.valueOf(A7911Dtp_UOrd)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPPROLIN");
      if ( (pr_default.getStatus(0) == 1) )
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
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP2[0] = tproces_lineas_ins.this.AV11Pronumlin;
      this.aP3[0] = tproces_lineas_ins.this.AV10Fascod;
      Application.commitDataStores(context, remoteHandle, pr_default, "ficherosbasicos.tproces_lineas_ins");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A396EmprCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A5735ProFasNot = "" ;
      A7892Dtp_FasDsc = "" ;
      A7893Dtp_Tpp = DecimalUtil.ZERO ;
      A7894Dtp_H2OReh = "" ;
      A7896Dtp_UnpLt = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ficherosbasicos.tproces_lineas_ins__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV11Pronumlin ;
   private short A774ProNumLin ;
   private short A6437ProUltFP ;
   private short A7895Dtp_TpCost ;
   private short A7911Dtp_UOrd ;
   private short Gx_err ;
   private int GX_INS88 ;
   private java.math.BigDecimal A7893Dtp_Tpp ;
   private java.math.BigDecimal A7896Dtp_UnpLt ;
   private String AV8emprcod ;
   private String AV9Procod ;
   private String AV10Fascod ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A7892Dtp_FasDsc ;
   private String A7894Dtp_H2OReh ;
   private String Gx_emsg ;
   private boolean n5735ProFasNot ;
   private boolean n7892Dtp_FasDsc ;
   private boolean n7893Dtp_Tpp ;
   private boolean n7894Dtp_H2OReh ;
   private boolean n7895Dtp_TpCost ;
   private boolean n7896Dtp_UnpLt ;
   private boolean n7911Dtp_UOrd ;
   private String A5735ProFasNot ;
   private String[] aP3 ;
   private short[] aP2 ;
   private IDataStoreProvider pr_default ;
}

final  class tproces_lineas_ins__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P0A9P2", "INSERT INTO TXPPROLIN(EmprCod, ProCod, ProNumLin, FasCod, ProFasNot, ProUltFP, Dtp_FasDsc, Dtp_Tpp, Dtp_H2OReh, Dtp_TpCost, Dtp_UnpLt, Dtp_UOrd) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPPROLIN")
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
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
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 8);
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(5, (String)parms[5], 400);
               }
               stmt.setShort(6, ((Number) parms[6]).shortValue());
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 90);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(8, (java.math.BigDecimal)parms[10], 2);
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[12], 1);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[14]).shortValue());
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.DECIMAL );
               }
               else
               {
                  stmt.setBigDecimal(11, (java.math.BigDecimal)parms[16], 2);
               }
               if ( ((Boolean) parms[17]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[18]).shortValue());
               }
               return;
      }
   }

}

