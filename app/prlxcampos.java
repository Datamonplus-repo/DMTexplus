package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prlxcampos extends GXProcedure
{
   public prlxcampos( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prlxcampos.class ), "" );
   }

   public prlxcampos( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 )
   {
      prlxcampos.this.aP2 = new String[] {""};
      execute_int(aP0, aP1, aP2);
      return aP2[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 )
   {
      execute_int(aP0, aP1, aP2);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 )
   {
      prlxcampos.this.AV9Emprcod = aP0[0];
      this.aP0 = aP0;
      prlxcampos.this.AV11RARID = aP1[0];
      this.aP1 = aP1;
      prlxcampos.this.AV8RARMaq = aP2[0];
      this.aP2 = aP2;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV10i = (short)(1) ;
      while ( AV10i <= 5 )
      {
         /*
            INSERT RECORD ON TABLE TXPDSPRA4

         */
         A396EmprCod = AV9Emprcod ;
         A13604RARID = AV11RARID ;
         A602MaqCod = AV8RARMaq ;
         A13673RARCampo = AV10i ;
         A13628RARTp1I1 = (short)(0) ;
         n13628RARTp1I1 = false ;
         A13629RARTp1I2 = (short)(0) ;
         n13629RARTp1I2 = false ;
         A13663RARVt1I1 = (short)(0) ;
         n13663RARVt1I1 = false ;
         A13664RARVt1I2 = (short)(0) ;
         n13664RARVt1I2 = false ;
         A13638RARVt1I1dw = (short)(0) ;
         n13638RARVt1I1dw = false ;
         A13639RARVt1I1up = (short)(0) ;
         n13639RARVt1I1up = false ;
         A13640RARVt1I2dw = (short)(0) ;
         n13640RARVt1I2dw = false ;
         A13641RARVt1I2up = (short)(0) ;
         n13641RARVt1I2up = false ;
         /* Using cursor P062X2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A13604RARID), A602MaqCod, Short.valueOf(A13673RARCampo), Boolean.valueOf(n13628RARTp1I1), Short.valueOf(A13628RARTp1I1), Boolean.valueOf(n13629RARTp1I2), Short.valueOf(A13629RARTp1I2), Boolean.valueOf(n13663RARVt1I1), Short.valueOf(A13663RARVt1I1), Boolean.valueOf(n13664RARVt1I2), Short.valueOf(A13664RARVt1I2), Boolean.valueOf(n13638RARVt1I1dw), Short.valueOf(A13638RARVt1I1dw), Boolean.valueOf(n13639RARVt1I1up), Short.valueOf(A13639RARVt1I1up), Boolean.valueOf(n13640RARVt1I2dw), Short.valueOf(A13640RARVt1I2dw), Boolean.valueOf(n13641RARVt1I2up), Short.valueOf(A13641RARVt1I2up)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPDSPRA4");
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
         AV10i = (short)(AV10i+1) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prlxcampos.this.AV9Emprcod;
      this.aP1[0] = prlxcampos.this.AV11RARID;
      this.aP2[0] = prlxcampos.this.AV8RARMaq;
      Application.commitDataStores(context, remoteHandle, pr_default, "prlxcampos");
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
      A602MaqCod = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prlxcampos__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private short AV10i ;
   private short A13673RARCampo ;
   private short A13628RARTp1I1 ;
   private short A13629RARTp1I2 ;
   private short A13663RARVt1I1 ;
   private short A13664RARVt1I2 ;
   private short A13638RARVt1I1dw ;
   private short A13639RARVt1I1up ;
   private short A13640RARVt1I2dw ;
   private short A13641RARVt1I2up ;
   private short Gx_err ;
   private int AV11RARID ;
   private int GX_INS1866 ;
   private int A13604RARID ;
   private String AV9Emprcod ;
   private String AV8RARMaq ;
   private String A396EmprCod ;
   private String A602MaqCod ;
   private String Gx_emsg ;
   private boolean n13628RARTp1I1 ;
   private boolean n13629RARTp1I2 ;
   private boolean n13663RARVt1I1 ;
   private boolean n13664RARVt1I2 ;
   private boolean n13638RARVt1I1dw ;
   private boolean n13639RARVt1I1up ;
   private boolean n13640RARVt1I2dw ;
   private boolean n13641RARVt1I2up ;
   private String[] aP2 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private IDataStoreProvider pr_default ;
}

final  class prlxcampos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P062X2", "INSERT INTO TXPDSPRA4(EmprCod, RARID, MaqCod, RARCampo, RARTp1I1, RARTp1I2, RARVt1I1, RARVt1I2, RARVt1I1dw, RARVt1I1up, RARVt1I2dw, RARVt1I2up) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPDSPRA4")
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
               stmt.setString(3, (String)parms[2], 6);
               stmt.setShort(4, ((Number) parms[3]).shortValue());
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(5, ((Number) parms[5]).shortValue());
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(6, ((Number) parms[7]).shortValue());
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[9]).shortValue());
               }
               if ( ((Boolean) parms[10]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(8, ((Number) parms[11]).shortValue());
               }
               if ( ((Boolean) parms[12]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(9, ((Number) parms[13]).shortValue());
               }
               if ( ((Boolean) parms[14]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(10, ((Number) parms[15]).shortValue());
               }
               if ( ((Boolean) parms[16]).booleanValue() )
               {
                  stmt.setNull( 11 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(11, ((Number) parms[17]).shortValue());
               }
               if ( ((Boolean) parms[18]).booleanValue() )
               {
                  stmt.setNull( 12 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(12, ((Number) parms[19]).shortValue());
               }
               return;
      }
   }

}

