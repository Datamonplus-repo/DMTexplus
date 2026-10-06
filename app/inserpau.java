package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class inserpau extends GXProcedure
{
   public inserpau( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( inserpau.class ), "" );
   }

   public inserpau( int remoteHandle ,
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
      inserpau.this.aP4 = new String[] {""};
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
      inserpau.this.AV8emprcod = aP0[0];
      this.aP0 = aP0;
      inserpau.this.AV10Clicod = aP1[0];
      this.aP1 = aP1;
      inserpau.this.AV11ArtCod = aP2[0];
      this.aP2 = aP2;
      inserpau.this.AV12Procod = aP3[0];
      this.aP3 = aP3;
      inserpau.this.AV9Fascod = aP4[0];
      this.aP4 = aP4;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPSERPAU

      */
      A396EmprCod = AV8emprcod ;
      A252CliCod = AV10Clicod ;
      A65ArtCod = AV11ArtCod ;
      A758ProCod = AV12Procod ;
      A457FasCod = AV9Fascod ;
      A4894ArtProULin = (short)(0) ;
      n4894ArtProULin = false ;
      A4895ArtProFacT = GXutil.space( (short)(1)) ;
      n4895ArtProFacT = false ;
      A4896ArtProFac = DecimalUtil.doubleToDec(0) ;
      n4896ArtProFac = false ;
      A4031CCTCod = 0 ;
      n4031CCTCod = false ;
      A8560ArtFasFac = DecimalUtil.doubleToDec(0) ;
      /* Using cursor P08GT2 */
      pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A252CliCod), A65ArtCod, A758ProCod, A457FasCod, Boolean.valueOf(n4894ArtProULin), Short.valueOf(A4894ArtProULin), Boolean.valueOf(n4895ArtProFacT), A4895ArtProFacT, Boolean.valueOf(n4896ArtProFac), A4896ArtProFac, Boolean.valueOf(n4031CCTCod), Integer.valueOf(A4031CCTCod), A8560ArtFasFac});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPSERPAU");
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
      this.aP0[0] = inserpau.this.AV8emprcod;
      this.aP1[0] = inserpau.this.AV10Clicod;
      this.aP2[0] = inserpau.this.AV11ArtCod;
      this.aP3[0] = inserpau.this.AV12Procod;
      this.aP4[0] = inserpau.this.AV9Fascod;
      Application.commitDataStores(context, remoteHandle, pr_default, "inserpau");
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
      A65ArtCod = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A4895ArtProFacT = "" ;
      A4896ArtProFac = DecimalUtil.ZERO ;
      A8560ArtFasFac = DecimalUtil.ZERO ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.inserpau__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short A4894ArtProULin ;
   private short Gx_err ;
   private int AV10Clicod ;
   private int GX_INS476 ;
   private int A252CliCod ;
   private int A4031CCTCod ;
   private java.math.BigDecimal A4896ArtProFac ;
   private java.math.BigDecimal A8560ArtFasFac ;
   private String AV8emprcod ;
   private String AV11ArtCod ;
   private String AV12Procod ;
   private String AV9Fascod ;
   private String A396EmprCod ;
   private String A65ArtCod ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A4895ArtProFacT ;
   private String Gx_emsg ;
   private boolean n4894ArtProULin ;
   private boolean n4895ArtProFacT ;
   private boolean n4896ArtProFac ;
   private boolean n4031CCTCod ;
   private String[] aP4 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private IDataStoreProvider pr_default ;
}

final  class inserpau__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P08GT2", "INSERT INTO TXPSERPAU(EmprCod, CliCod, ArtCod, ProCod, FasCod, ArtProULin, ArtProFacT, ArtProFac, CCTCod, ArtFasFac, ArtFasPyS, ArtFasPpp, ArtFasVel, ArtFasNPs) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, 0, 0, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPSERPAU")
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setString(3, (String)parms[2], 16);
               stmt.setString(4, (String)parms[3], 8);
               stmt.setString(5, (String)parms[4], 8);
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[6]).shortValue());
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(7, (String)parms[8], 1);
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
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(9, ((Number) parms[12]).intValue());
               }
               stmt.setBigDecimal(10, (java.math.BigDecimal)parms[13], 2);
               return;
      }
   }

}

