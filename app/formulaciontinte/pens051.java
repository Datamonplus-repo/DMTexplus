package app.formulaciontinte ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class pens051 extends GXProcedure
{
   public pens051( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( pens051.class ), "" );
   }

   public pens051( int remoteHandle ,
                   ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public short executeUdp( String[] aP0 ,
                            String[] aP1 ,
                            int[] aP2 )
   {
      pens051.this.aP3 = new short[] {0};
      execute_int(aP0, aP1, aP2, aP3);
      return aP3[0];
   }

   public void execute( String[] aP0 ,
                        String[] aP1 ,
                        int[] aP2 ,
                        short[] aP3 )
   {
      execute_int(aP0, aP1, aP2, aP3);
   }

   private void execute_int( String[] aP0 ,
                             String[] aP1 ,
                             int[] aP2 ,
                             short[] aP3 )
   {
      pens051.this.A396EmprCod = aP0[0];
      this.aP0 = aP0;
      pens051.this.AV15MacProCod = aP1[0];
      this.aP1 = aP1;
      pens051.this.AV25Lb_numero = aP2[0];
      this.aP2 = aP2;
      pens051.this.AV21ForUltLin = aP3[0];
      this.aP3 = aP3;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      GXt_int1 = AV27Tinamar ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int2) ;
      pens051.this.GXt_int1 = GXv_int2[0] ;
      AV27Tinamar = GXt_int1 ;
      if ( AV27Tinamar == 1 )
      {
         GXv_char3[0] = A396EmprCod ;
         GXv_int4[0] = AV25Lb_numero ;
         new app.pdelmacroprocesos(remoteHandle, context).execute( GXv_char3, GXv_int4) ;
         pens051.this.A396EmprCod = GXv_char3[0] ;
         pens051.this.AV25Lb_numero = GXv_int4[0] ;
      }
      GXt_int5 = AV23Num_l ;
      GXv_int4[0] = GXt_int5 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CMACPR", ""), GXv_int4) ;
      pens051.this.GXt_int5 = GXv_int4[0] ;
      AV23Num_l = (short)(GXt_int5) ;
      AV23Num_l = (short)(((0==AV23Num_l) ? 10 : AV23Num_l)) ;
      AV22ProForL = (short)(0) ;
      /* Using cursor P02E32 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV15MacProCod});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1514MacProCod = P02E32_A1514MacProCod[0] ;
         A764ProForCod = P02E32_A764ProForCod[0] ;
         A1517MacProLin = P02E32_A1517MacProLin[0] ;
         AV26PROFORCOD = A764ProForCod ;
         AV22ProForL = (short)(AV22ProForL+AV23Num_l) ;
         /*
            INSERT RECORD ON TABLE TXPENS000

         */
         A5532Lb_numero = AV25Lb_numero ;
         A5551Lb_lineaPq = AV22ProForL ;
         A5553Lb_ForCod = AV26PROFORCOD ;
         A6372Lb_RecPip = httpContext.getMessage( "S", "") ;
         A8621Lb_Envio = httpContext.getMessage( "S", "") ;
         /* Using cursor P02E33 */
         pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A5532Lb_numero), Short.valueOf(A5551Lb_lineaPq), A5553Lb_ForCod, A6372Lb_RecPip, A8621Lb_Envio});
         Application.getSmartCacheProvider(remoteHandle).setUpdated("TXPENS000");
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
      AV21ForUltLin = AV22ProForL ;
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP0[0] = pens051.this.A396EmprCod;
      this.aP1[0] = pens051.this.AV15MacProCod;
      this.aP2[0] = pens051.this.AV25Lb_numero;
      this.aP3[0] = pens051.this.AV21ForUltLin;
      Application.commitDataStores(context, remoteHandle, pr_default, "formulaciontinte.pens051");
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      GXv_int2 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int4 = new int[1] ;
      scmdbuf = "" ;
      P02E32_A396EmprCod = new String[] {""} ;
      P02E32_A1514MacProCod = new String[] {""} ;
      P02E32_A764ProForCod = new String[] {""} ;
      P02E32_A1517MacProLin = new short[1] ;
      A1514MacProCod = "" ;
      A764ProForCod = "" ;
      AV26PROFORCOD = "" ;
      A5553Lb_ForCod = "" ;
      A6372Lb_RecPip = "" ;
      A8621Lb_Envio = "" ;
      Gx_emsg = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.pens051__default(),
         new Object[] {
             new Object[] {
            P02E32_A396EmprCod, P02E32_A1514MacProCod, P02E32_A764ProForCod, P02E32_A1517MacProLin
            }
            , new Object[] {
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte AV27Tinamar ;
   private byte GXt_int1 ;
   private byte GXv_int2[] ;
   private short AV21ForUltLin ;
   private short AV23Num_l ;
   private short AV22ProForL ;
   private short A1517MacProLin ;
   private short A5551Lb_lineaPq ;
   private short Gx_err ;
   private int AV25Lb_numero ;
   private int GXt_int5 ;
   private int GXv_int4[] ;
   private int GX_INS818 ;
   private int A5532Lb_numero ;
   private String A396EmprCod ;
   private String AV15MacProCod ;
   private String GXv_char3[] ;
   private String scmdbuf ;
   private String A1514MacProCod ;
   private String A764ProForCod ;
   private String AV26PROFORCOD ;
   private String A5553Lb_ForCod ;
   private String A6372Lb_RecPip ;
   private String A8621Lb_Envio ;
   private String Gx_emsg ;
   private short[] aP3 ;
   private String[] aP0 ;
   private String[] aP1 ;
   private int[] aP2 ;
   private IDataStoreProvider pr_default ;
   private String[] P02E32_A396EmprCod ;
   private String[] P02E32_A1514MacProCod ;
   private String[] P02E32_A764ProForCod ;
   private short[] P02E32_A1517MacProLin ;
}

final  class pens051__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P02E32", "SELECT EmprCod, MacProCod, ProForCod, MacProLin FROM TXPLMACPR WHERE EmprCod = ? and MacProCod = ? ORDER BY EmprCod, MacProCod, MacProLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new UpdateCursor("P02E33", "INSERT INTO TXPENS000(EmprCod, Lb_numero, Lb_lineaPq, Lb_ForCod, Lb_RecPip, Lb_Envio) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK + GX_MASKLOOPLOCK, "TXPENS000")
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setShort(3, ((Number) parms[2]).shortValue());
               stmt.setString(4, (String)parms[3], 6);
               stmt.setString(5, (String)parms[4], 1);
               stmt.setString(6, (String)parms[5], 1);
               return;
      }
   }

}

