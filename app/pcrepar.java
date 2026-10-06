package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pcrepar extends GXProcedure
{
   public pcrepar( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pcrepar.class ), "" );
   }

   public pcrepar( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public String executeUdp( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.math.BigDecimal[] aP5 )
   {
      pcrepar.this.aP6 = new String[] {""};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String[] aP0 ,
                        int[] aP1 ,
                        String[] aP2 ,
                        String[] aP3 ,
                        java.util.Date[] aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        String[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String[] aP0 ,
                             int[] aP1 ,
                             String[] aP2 ,
                             String[] aP3 ,
                             java.util.Date[] aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             String[] aP6 )
   {
      pcrepar.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pcrepar.this.AV15CliCod = aP1[0];
      this.aP1 = aP1;
      pcrepar.this.AV16PartCod = aP2[0];
      this.aP2 = aP2;
      pcrepar.this.AV17ParArtCod = aP3[0];
      this.aP3 = aP3;
      pcrepar.this.AV18OpeAntFch = aP4[0];
      this.aP4 = aP4;
      pcrepar.this.AV19ProceCod = aP5[0];
      this.aP5 = aP5;
      pcrepar.this.AV20ParNMtr = aP6[0];
      this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      /*
         INSERT RECORD ON TABLE TXPCPARTI

      */
      A966PartCod = AV16PartCod ;
      A252CliCod = AV15CliCod ;
      A1456ParArtCod = AV17ParArtCod ;
      n1456ParArtCod = false ;
      A968PartFec = AV18OpeAntFch ;
      n968PartFec = false ;
      A970ProceCod = (short)(DecimalUtil.decToDouble(AV19ProceCod)) ;
      n970ProceCod = false ;
      A1457ParNMtr = AV20ParNMtr ;
      n1457ParNMtr = false ;
      A2245PartEstM = httpContext.getMessage( "N", "") ;
      n2245PartEstM = false ;
      A2376PartExt = (byte)(0) ;
      n2376PartExt = false ;
      A2244PartReo = httpContext.getMessage( "NO", "") ;
      n2244PartReo = false ;
      /* Using cursor P00EB2 */
      pr_default.execute(0, new Object[] {A396EmprCod, A966PartCod, Integer.valueOf(A252CliCod), Boolean.valueOf(n1456ParArtCod), A1456ParArtCod, Boolean.valueOf(n1457ParNMtr), A1457ParNMtr, Boolean.valueOf(n968PartFec), A968PartFec, Boolean.valueOf(n970ProceCod), Short.valueOf(A970ProceCod), Boolean.valueOf(n2244PartReo), A2244PartReo, Boolean.valueOf(n2245PartEstM), A2245PartEstM, Boolean.valueOf(n2376PartExt), Byte.valueOf(A2376PartExt)});
      Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPCPARTI");
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
      this.aP0[0] = pcrepar.this.A396EmprCod;
      this.aP1[0] = pcrepar.this.AV15CliCod;
      this.aP2[0] = pcrepar.this.AV16PartCod;
      this.aP3[0] = pcrepar.this.AV17ParArtCod;
      this.aP4[0] = pcrepar.this.AV18OpeAntFch;
      this.aP5[0] = pcrepar.this.AV19ProceCod;
      this.aP6[0] = pcrepar.this.AV20ParNMtr;
      Application.commitDataStores(context, remoteHandle, pr_default, "pcrepar");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      A966PartCod = "" ;
      A1456ParArtCod = "" ;
      A968PartFec = GXutil.nullDate() ;
      A1457ParNMtr = "" ;
      A2245PartEstM = "" ;
      A2244PartReo = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pcrepar__default(),
         new Object[] {
             new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A2376PartExt ;
   private short A970ProceCod ;
   private short Gx_err ;
   private int AV15CliCod ;
   private int GX_INS207 ;
   private int A252CliCod ;
   private java.math.BigDecimal AV19ProceCod ;
   private String A396EmprCod ;
   private String AV16PartCod ;
   private String AV17ParArtCod ;
   private String AV20ParNMtr ;
   private String A966PartCod ;
   private String A1456ParArtCod ;
   private String A1457ParNMtr ;
   private String A2245PartEstM ;
   private String A2244PartReo ;
   private String Gx_emsg ;
   private java.util.Date AV18OpeAntFch ;
   private java.util.Date A968PartFec ;
   private boolean n1456ParArtCod ;
   private boolean n968PartFec ;
   private boolean n970ProceCod ;
   private boolean n1457ParNMtr ;
   private boolean n2245PartEstM ;
   private boolean n2376PartExt ;
   private boolean n2244PartReo ;
   private String[] aP6 ;
   private String[] aP0 ;
   private int[] aP1 ;
   private String[] aP2 ;
   private String[] aP3 ;
   private java.util.Date[] aP4 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
}

final  class pcrepar__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new UpdateCursor("P00EB2", "INSERT INTO TXPCPARTI(EmprCod, PartCod, CliCod, ParArtCod, ParNMtr, PartFec, ProceCod, PartReo, PartEstM, PartExt, PartULin, PartDsc, PartSec, TipArtCod, PartOpe, PartTipP, PartPre, ParObsLon, ParUEstM, ParUbiLin, ParUObsLon, CruCod, PartUni, PartCnf, PartUltPal, PartCoef, Pdo_UltL, Ub_Cod, PartRemTpo, PartRemSuc, PartRemFch, PartRemNro, PartOCOCod) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, 0, ' ', ' ', 0, ' ', ' ', 0, ' ', ' ', 0, ' ', 0, ' ', ' ', 0, 0, 0, ' ', ' ', ' ', TO_DATE('0001-01-01', 'YYYY-MM-DD'), ' ', ' ')", GX_NOMASK + GX_MASKLOOPLOCK, "TXPCPARTI")
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
               stmt.setString(2, (String)parms[1], 16);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(4, (String)parms[4], 16);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[6], 10);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.DATE );
               }
               else
               {
                  stmt.setDate(6, (java.util.Date)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 7 , Types.NUMERIC );
               }
               else
               {
                  stmt.setShort(7, ((Number) parms[10]).shortValue());
               }
               if ( ((Boolean) parms[11]).booleanValue() )
               {
                  stmt.setNull( 8 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(8, (String)parms[12], 2);
               }
               if ( ((Boolean) parms[13]).booleanValue() )
               {
                  stmt.setNull( 9 , Types.VARCHAR );
               }
               else
               {
                  stmt.setString(9, (String)parms[14], 1);
               }
               if ( ((Boolean) parms[15]).booleanValue() )
               {
                  stmt.setNull( 10 , Types.NUMERIC );
               }
               else
               {
                  stmt.setByte(10, ((Number) parms[16]).byteValue());
               }
               return;
      }
   }

}

