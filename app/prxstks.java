package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class prxstks extends GXProcedure
{
   public prxstks( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( prxstks.class ), "" );
   }

   public prxstks( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.util.Date executeUdp( String[] aP0 )
   {
      prxstks.this.aP1 = new java.util.Date[] {GXutil.nullDate()};
      execute_int(aP0, aP1);
      return aP1[0];
   }

   public void execute( String[] aP0 ,
                        java.util.Date[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String[] aP0 ,
                             java.util.Date[] aP1 )
   {
      prxstks.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      prxstks.this.A6715RSRFCH = aP1[0];
      this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8Cont = DecimalUtil.doubleToDec(1) ;
      while ( AV8Cont.doubleValue() <= 4 )
      {
         /*
            INSERT RECORD ON TABLE TXPRXSTK1

         */
         A6716RSRSEC = (byte)(DecimalUtil.decToDouble(AV8Cont)) ;
         /* Using cursor P02N22 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A5874CruCod = P02N22_A5874CruCod[0] ;
            /*
               INSERT RECORD ON TABLE TXPRXSTK2

            */
            A6717RSRTIPCRU = A5874CruCod ;
            if ( AV8Cont.doubleValue() == 4 )
            {
               /* Using cursor P02N23 */
               pr_default.execute(1, new Object[] {A396EmprCod});
               while ( (pr_default.getStatus(1) != 101) )
               {
                  A457FasCod = P02N23_A457FasCod[0] ;
                  /*
                     INSERT RECORD ON TABLE TXPRXSTK3

                  */
                  A6719RSRFASCOD = A457FasCod ;
                  /* Using cursor P02N24 */
                  pr_default.execute(2, new Object[] {A396EmprCod, A6715RSRFCH, Byte.valueOf(A6716RSRSEC), Integer.valueOf(A6717RSRTIPCRU), A6719RSRFASCOD});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRXSTK3");
                  if ( (pr_default.getStatus(2) == 1) )
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
                  pr_default.readNext(1);
               }
               pr_default.close(1);
            }
            /* Using cursor P02N25 */
            pr_default.execute(3, new Object[] {A396EmprCod, A6715RSRFCH, Byte.valueOf(A6716RSRSEC), Integer.valueOf(A6717RSRTIPCRU)});
            Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRXSTK2");
            if ( (pr_default.getStatus(3) == 1) )
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
         /* Using cursor P02N26 */
         pr_default.execute(4, new Object[] {A396EmprCod, A6715RSRFCH, Byte.valueOf(A6716RSRSEC)});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPRXSTK1");
         if ( (pr_default.getStatus(4) == 1) )
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
         AV8Cont = AV8Cont.add(DecimalUtil.doubleToDec(1)) ;
      }
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = prxstks.this.A396EmprCod;
      this.aP1[0] = prxstks.this.A6715RSRFCH;
      Application.commitDataStores(context, remoteHandle, pr_default, "prxstks");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV8Cont = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P02N22_A396EmprCod = new String[] {""} ;
      P02N22_A5874CruCod = new int[1] ;
      P02N23_A396EmprCod = new String[] {""} ;
      P02N23_A457FasCod = new String[] {""} ;
      A457FasCod = "" ;
      A6719RSRFASCOD = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.prxstks__default(),
         new Object[] {
             new Object[] {
            P02N22_A396EmprCod, P02N22_A5874CruCod
            }
            , new Object[] {
            P02N23_A396EmprCod, P02N23_A457FasCod
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A6716RSRSEC ;
   private short Gx_err ;
   private int GX_INS961 ;
   private int A5874CruCod ;
   private int GX_INS962 ;
   private int A6717RSRTIPCRU ;
   private int GX_INS963 ;
   private java.math.BigDecimal AV8Cont ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A457FasCod ;
   private String A6719RSRFASCOD ;
   private String Gx_emsg ;
   private java.util.Date A6715RSRFCH ;
   private java.util.Date[] aP1 ;
   private String[] aP0 ;
   private IDataStoreProvider pr_default ;
   private String[] P02N22_A396EmprCod ;
   private int[] P02N22_A5874CruCod ;
   private String[] P02N23_A396EmprCod ;
   private String[] P02N23_A457FasCod ;
}

final  class prxstks__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02N22", "SELECT EmprCod, CruCod FROM TXPCruTip WHERE EmprCod = ? ORDER BY EmprCod, CruCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P02N23", "SELECT EmprCod, FasCod FROM TXPFASPRO WHERE EmprCod = ? ORDER BY EmprCod, FasCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02N24", "INSERT INTO TXPRXSTK3(EmprCod, RSRFCH, RSRSEC, RSRTIPCRU, RSRFASCOD, RSRFASKIL) VALUES(?, ?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRXSTK3")
         ,new UpdateCursor("P02N25", "INSERT INTO TXPRXSTK2(EmprCod, RSRFCH, RSRSEC, RSRTIPCRU, RSRKIL) VALUES(?, ?, ?, ?, 0)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRXSTK2")
         ,new UpdateCursor("P02N26", "INSERT INTO TXPRXSTK1(EmprCod, RSRFCH, RSRSEC) VALUES(?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPRXSTK1")
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 8);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               return;
      }
   }

}

