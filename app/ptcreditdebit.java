package app ;
import app.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class ptcreditdebit extends GXProcedure
{
   public ptcreditdebit( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ptcreditdebit.class ), "" );
   }

   public ptcreditdebit( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   @SuppressWarnings("unchecked")
   public java.math.BigDecimal executeUdp( String aP0 ,
                                           java.util.Date aP1 ,
                                           java.util.Date aP2 ,
                                           int aP3 ,
                                           int aP4 ,
                                           java.math.BigDecimal[] aP5 )
   {
      ptcreditdebit.this.aP6 = new java.math.BigDecimal[] {DecimalUtil.ZERO};
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
      return aP6[0];
   }

   public void execute( String aP0 ,
                        java.util.Date aP1 ,
                        java.util.Date aP2 ,
                        int aP3 ,
                        int aP4 ,
                        java.math.BigDecimal[] aP5 ,
                        java.math.BigDecimal[] aP6 )
   {
      execute_int(aP0, aP1, aP2, aP3, aP4, aP5, aP6);
   }

   private void execute_int( String aP0 ,
                             java.util.Date aP1 ,
                             java.util.Date aP2 ,
                             int aP3 ,
                             int aP4 ,
                             java.math.BigDecimal[] aP5 ,
                             java.math.BigDecimal[] aP6 )
   {
      ptcreditdebit.this.A396EmprCod = aP0;
      ptcreditdebit.this.AV52Fec1 = aP1;
      ptcreditdebit.this.AV53Fec2 = aP2;
      ptcreditdebit.this.AV71Faccod1 = aP3;
      ptcreditdebit.this.AV72FacCod2 = aP4;
      ptcreditdebit.this.aP5 = aP5;
      ptcreditdebit.this.aP6 = aP6;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV141totalcredit = DecimalUtil.ZERO ;
      AV140totaldebit = DecimalUtil.ZERO ;
      AV75TotalC = DecimalUtil.ZERO ;
      AV74TotalD = DecimalUtil.ZERO ;
      /* Using cursor P0A5L2 */
      pr_default.execute(0, new Object[] {A396EmprCod, AV52Fec1, Integer.valueOf(AV71Faccod1), Integer.valueOf(AV72FacCod2), AV53Fec2});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A450FacPri = P0A5L2_A450FacPri[0] ;
         A430FacCod = P0A5L2_A430FacCod[0] ;
         A436FacFch = P0A5L2_A436FacFch[0] ;
         A1153FacTipFac = P0A5L2_A1153FacTipFac[0] ;
         A9646FacTot1 = P0A5L2_A9646FacTot1[0] ;
         AV86FacTipFac = A1153FacTipFac ;
         AV59FacCod = A430FacCod ;
         if ( A9646FacTot1.doubleValue() == 0 )
         {
            /* Execute user subroutine: 'FACTURANULL' */
            S121 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         else
         {
            /* Execute user subroutine: 'FACTURANOTNULL' */
            S111 ();
            if ( returnInSub )
            {
               pr_default.close(0);
               returnInSub = true;
               cleanup();
               if (true) return;
            }
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      AV74TotalD = AV140totaldebit ;
      AV75TotalC = AV141totalcredit ;
      cleanup();
   }

   public void S111( )
   {
      /* 'FACTURANOTNULL' Routine */
      returnInSub = false ;
      /* Using cursor P0A5L3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(AV59FacCod)});
      while ( (pr_default.getStatus(1) != 101) )
      {
         A430FacCod = P0A5L3_A430FacCod[0] ;
         A5353FacImpMan = P0A5L3_A5353FacImpMan[0] ;
         A12197FacUnds = P0A5L3_A12197FacUnds[0] ;
         A12198FacPreUnd = P0A5L3_A12198FacPreUnd[0] ;
         A447FacMts = P0A5L3_A447FacMts[0] ;
         A449FacPreMts = P0A5L3_A449FacPreMts[0] ;
         A444FacKgs = P0A5L3_A444FacKgs[0] ;
         A448FacPreKgs = P0A5L3_A448FacPreKgs[0] ;
         A428FacAlbTip = P0A5L3_A428FacAlbTip[0] ;
         A3897FacKgsA = P0A5L3_A3897FacKgsA[0] ;
         A9649FacPKDto = P0A5L3_A9649FacPKDto[0] ;
         A3898FacPreKgsA = P0A5L3_A3898FacPreKgsA[0] ;
         A9650FacPMdto = P0A5L3_A9650FacPMdto[0] ;
         A446FacLin = P0A5L3_A446FacLin[0] ;
         AV149precio = DecimalUtil.ZERO ;
         AV150cantidad = DecimalUtil.ZERO ;
         AV142facim1 = DecimalUtil.ZERO ;
         AV143facimp = DecimalUtil.ZERO ;
         if ( ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) ) || ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) ) || ( ( A12198FacPreUnd.doubleValue() > 0 ) && ( A12197FacUnds > 0 ) ) || ( ( A5353FacImpMan.doubleValue() > 0 ) && ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() == 0 ) ) )
         {
            AV96PrecKg = (byte)(0) ;
            AV97PrecMt = (byte)(0) ;
            if ( A428FacAlbTip == 1 )
            {
               if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A3897FacKgsA.doubleValue() == 0 ) && ( A444FacKgs.doubleValue() > 0 ) )
               {
                  AV149precio = A9649FacPKDto ;
                  AV150cantidad = A444FacKgs ;
                  AV142facim1 = A9649FacPKDto.multiply(A444FacKgs) ;
                  AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
                  AV96PrecKg = (byte)(1) ;
               }
               if ( ( A448FacPreKgs.doubleValue() > 0 ) && ( A3897FacKgsA.doubleValue() == 1 ) && ( A444FacKgs.doubleValue() > 0 ) )
               {
                  AV151implinea = (A444FacKgs.multiply(A448FacPreKgs)).add((A3898FacPreKgsA.multiply(DecimalUtil.doubleToDec(1)))) ;
                  AV149precio = A9649FacPKDto ;
                  AV150cantidad = A444FacKgs ;
                  AV142facim1 = AV151implinea ;
                  AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
                  AV96PrecKg = (byte)(1) ;
               }
               if ( ( A449FacPreMts.doubleValue() > 0 ) && ( A447FacMts.doubleValue() > 0 ) )
               {
                  if ( AV96PrecKg == 0 )
                  {
                     AV149precio = A9650FacPMdto ;
                     AV150cantidad = A447FacMts ;
                     AV142facim1 = A9650FacPMdto.multiply(A447FacMts) ;
                     AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
                  }
               }
               if ( ( A12198FacPreUnd.doubleValue() > 0 ) && ( A12197FacUnds > 0 ) )
               {
                  AV149precio = A9650FacPMdto ;
                  AV150cantidad = DecimalUtil.doubleToDec(A12197FacUnds) ;
                  AV142facim1 = A9650FacPMdto.multiply(DecimalUtil.doubleToDec(A12197FacUnds)) ;
                  AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
               }
               if ( ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() == 0 ) && ( A5353FacImpMan.doubleValue() > 0 ) )
               {
                  AV149precio = A5353FacImpMan.divide(A444FacKgs, 18, java.math.RoundingMode.DOWN) ;
                  AV150cantidad = A444FacKgs ;
                  AV142facim1 = A5353FacImpMan ;
                  AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
               }
            }
            else
            {
               if ( A428FacAlbTip == 2 )
               {
                  if ( ( A447FacMts.doubleValue() > 0 ) && ( A449FacPreMts.doubleValue() != 0 ) )
                  {
                     AV149precio = A449FacPreMts ;
                     AV150cantidad = A447FacMts ;
                     AV142facim1 = A449FacPreMts.multiply(A447FacMts) ;
                     AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
                  }
                  if ( ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() != 0 ) )
                  {
                     AV149precio = A448FacPreKgs ;
                     AV150cantidad = A444FacKgs ;
                     AV142facim1 = A448FacPreKgs.multiply(A444FacKgs) ;
                     AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
                  }
               }
               else
               {
                  if ( ( A12197FacUnds > 0 ) && ( A12198FacPreUnd.doubleValue() != 0 ) )
                  {
                     AV149precio = A12198FacPreUnd ;
                     AV150cantidad = DecimalUtil.doubleToDec(A12197FacUnds) ;
                     AV142facim1 = A12198FacPreUnd.multiply(DecimalUtil.doubleToDec(A12197FacUnds)) ;
                     AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
                  }
                  if ( ( A447FacMts.doubleValue() > 0 ) && ( A449FacPreMts.doubleValue() != 0 ) )
                  {
                     AV149precio = A449FacPreMts ;
                     AV150cantidad = A447FacMts ;
                     AV142facim1 = A449FacPreMts.multiply(A447FacMts) ;
                     AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
                  }
                  if ( ( A444FacKgs.doubleValue() > 0 ) && ( A448FacPreKgs.doubleValue() != 0 ) )
                  {
                     AV149precio = A448FacPreKgs ;
                     AV150cantidad = A444FacKgs ;
                     AV142facim1 = A448FacPreKgs.multiply(A444FacKgs) ;
                     AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
                  }
               }
            }
            AV140totaldebit = AV140totaldebit.add((((AV86FacTipFac==2) ? AV143facimp : DecimalUtil.doubleToDec(0)))) ;
            AV141totalcredit = AV141totalcredit.add((((AV86FacTipFac!=2) ? AV143facimp : DecimalUtil.doubleToDec(0)))) ;
         }
         pr_default.readNext(1);
      }
      pr_default.close(1);
   }

   public void S121( )
   {
      /* 'FACTURANULL' Routine */
      returnInSub = false ;
      AV102SiLine = (byte)(0) ;
      /* Using cursor P0A5L4 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(AV59FacCod)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A430FacCod = P0A5L4_A430FacCod[0] ;
         A12197FacUnds = P0A5L4_A12197FacUnds[0] ;
         A447FacMts = P0A5L4_A447FacMts[0] ;
         A444FacKgs = P0A5L4_A444FacKgs[0] ;
         A428FacAlbTip = P0A5L4_A428FacAlbTip[0] ;
         A9649FacPKDto = P0A5L4_A9649FacPKDto[0] ;
         A9650FacPMdto = P0A5L4_A9650FacPMdto[0] ;
         A449FacPreMts = P0A5L4_A449FacPreMts[0] ;
         A448FacPreKgs = P0A5L4_A448FacPreKgs[0] ;
         A446FacLin = P0A5L4_A446FacLin[0] ;
         AV149precio = DecimalUtil.ZERO ;
         AV150cantidad = DecimalUtil.ZERO ;
         AV142facim1 = DecimalUtil.ZERO ;
         AV143facimp = DecimalUtil.ZERO ;
         if ( ( ( A444FacKgs.doubleValue() > 0 ) ) || ( ( A447FacMts.doubleValue() > 0 ) ) || ( ( A12197FacUnds > 0 ) ) )
         {
            AV102SiLine = (byte)(1) ;
            if ( A428FacAlbTip == 1 )
            {
               if ( A444FacKgs.doubleValue() > 0 )
               {
                  AV149precio = A9649FacPKDto ;
                  AV150cantidad = A444FacKgs ;
                  AV142facim1 = A9649FacPKDto.multiply(A444FacKgs) ;
                  AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
               }
               if ( A447FacMts.doubleValue() > 0 )
               {
                  AV149precio = A9650FacPMdto ;
                  AV150cantidad = A447FacMts ;
                  AV142facim1 = A9650FacPMdto.multiply(A447FacMts) ;
                  AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
               }
               if ( A12197FacUnds > 0 )
               {
                  AV149precio = A9650FacPMdto ;
                  AV150cantidad = DecimalUtil.doubleToDec(A12197FacUnds) ;
                  AV142facim1 = A9650FacPMdto.multiply(DecimalUtil.doubleToDec(A12197FacUnds)) ;
                  AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
               }
            }
            else
            {
               if ( A428FacAlbTip == 2 )
               {
                  if ( A447FacMts.doubleValue() > 0 )
                  {
                     AV149precio = A449FacPreMts ;
                     AV150cantidad = A447FacMts ;
                     AV142facim1 = A449FacPreMts.multiply(A447FacMts) ;
                     AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
                  }
                  if ( A444FacKgs.doubleValue() > 0 )
                  {
                     AV149precio = A448FacPreKgs ;
                     AV150cantidad = A444FacKgs ;
                     AV142facim1 = A448FacPreKgs.multiply(A444FacKgs) ;
                     AV143facimp = GXutil.roundDecimal( AV142facim1, 2) ;
                  }
               }
            }
            AV140totaldebit = AV140totaldebit.add((((AV86FacTipFac==2) ? AV143facimp : DecimalUtil.doubleToDec(0)))) ;
            AV141totalcredit = AV141totalcredit.add((((AV86FacTipFac!=2) ? AV143facimp : DecimalUtil.doubleToDec(0)))) ;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
   }

   protected void cleanup( )
   {
      this.aP5[0] = ptcreditdebit.this.AV74TotalD;
      this.aP6[0] = ptcreditdebit.this.AV75TotalC;
      CloseOpenCursors();
      exitApp();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV74TotalD = DecimalUtil.ZERO ;
      AV75TotalC = DecimalUtil.ZERO ;
      AV141totalcredit = DecimalUtil.ZERO ;
      AV140totaldebit = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      P0A5L2_A396EmprCod = new String[] {""} ;
      P0A5L2_A450FacPri = new String[] {""} ;
      P0A5L2_A430FacCod = new int[1] ;
      P0A5L2_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      P0A5L2_A1153FacTipFac = new byte[1] ;
      P0A5L2_A9646FacTot1 = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A450FacPri = "" ;
      A436FacFch = GXutil.nullDate() ;
      A9646FacTot1 = DecimalUtil.ZERO ;
      P0A5L3_A396EmprCod = new String[] {""} ;
      P0A5L3_A430FacCod = new int[1] ;
      P0A5L3_A5353FacImpMan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L3_A12197FacUnds = new int[1] ;
      P0A5L3_A12198FacPreUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L3_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L3_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L3_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L3_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L3_A428FacAlbTip = new byte[1] ;
      P0A5L3_A3897FacKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L3_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L3_A3898FacPreKgsA = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L3_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L3_A446FacLin = new int[1] ;
      A5353FacImpMan = DecimalUtil.ZERO ;
      A12198FacPreUnd = DecimalUtil.ZERO ;
      A447FacMts = DecimalUtil.ZERO ;
      A449FacPreMts = DecimalUtil.ZERO ;
      A444FacKgs = DecimalUtil.ZERO ;
      A448FacPreKgs = DecimalUtil.ZERO ;
      A3897FacKgsA = DecimalUtil.ZERO ;
      A9649FacPKDto = DecimalUtil.ZERO ;
      A3898FacPreKgsA = DecimalUtil.ZERO ;
      A9650FacPMdto = DecimalUtil.ZERO ;
      AV149precio = DecimalUtil.ZERO ;
      AV150cantidad = DecimalUtil.ZERO ;
      AV142facim1 = DecimalUtil.ZERO ;
      AV143facimp = DecimalUtil.ZERO ;
      AV151implinea = DecimalUtil.ZERO ;
      P0A5L4_A396EmprCod = new String[] {""} ;
      P0A5L4_A430FacCod = new int[1] ;
      P0A5L4_A12197FacUnds = new int[1] ;
      P0A5L4_A447FacMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L4_A444FacKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L4_A428FacAlbTip = new byte[1] ;
      P0A5L4_A9649FacPKDto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L4_A9650FacPMdto = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L4_A449FacPreMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L4_A448FacPreKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      P0A5L4_A446FacLin = new int[1] ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ptcreditdebit__default(),
         new Object[] {
             new Object[] {
            P0A5L2_A396EmprCod, P0A5L2_A450FacPri, P0A5L2_A430FacCod, P0A5L2_A436FacFch, P0A5L2_A1153FacTipFac, P0A5L2_A9646FacTot1
            }
            , new Object[] {
            P0A5L3_A396EmprCod, P0A5L3_A430FacCod, P0A5L3_A5353FacImpMan, P0A5L3_A12197FacUnds, P0A5L3_A12198FacPreUnd, P0A5L3_A447FacMts, P0A5L3_A449FacPreMts, P0A5L3_A444FacKgs, P0A5L3_A448FacPreKgs, P0A5L3_A428FacAlbTip,
            P0A5L3_A3897FacKgsA, P0A5L3_A9649FacPKDto, P0A5L3_A3898FacPreKgsA, P0A5L3_A9650FacPMdto, P0A5L3_A446FacLin
            }
            , new Object[] {
            P0A5L4_A396EmprCod, P0A5L4_A430FacCod, P0A5L4_A12197FacUnds, P0A5L4_A447FacMts, P0A5L4_A444FacKgs, P0A5L4_A428FacAlbTip, P0A5L4_A9649FacPKDto, P0A5L4_A9650FacPMdto, P0A5L4_A449FacPreMts, P0A5L4_A448FacPreKgs,
            P0A5L4_A446FacLin
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte A1153FacTipFac ;
   private byte AV86FacTipFac ;
   private byte A428FacAlbTip ;
   private byte AV96PrecKg ;
   private byte AV97PrecMt ;
   private byte AV102SiLine ;
   private short Gx_err ;
   private int AV71Faccod1 ;
   private int AV72FacCod2 ;
   private int A430FacCod ;
   private int AV59FacCod ;
   private int A12197FacUnds ;
   private int A446FacLin ;
   private java.math.BigDecimal AV74TotalD ;
   private java.math.BigDecimal AV75TotalC ;
   private java.math.BigDecimal AV141totalcredit ;
   private java.math.BigDecimal AV140totaldebit ;
   private java.math.BigDecimal A9646FacTot1 ;
   private java.math.BigDecimal A5353FacImpMan ;
   private java.math.BigDecimal A12198FacPreUnd ;
   private java.math.BigDecimal A447FacMts ;
   private java.math.BigDecimal A449FacPreMts ;
   private java.math.BigDecimal A444FacKgs ;
   private java.math.BigDecimal A448FacPreKgs ;
   private java.math.BigDecimal A3897FacKgsA ;
   private java.math.BigDecimal A9649FacPKDto ;
   private java.math.BigDecimal A3898FacPreKgsA ;
   private java.math.BigDecimal A9650FacPMdto ;
   private java.math.BigDecimal AV149precio ;
   private java.math.BigDecimal AV150cantidad ;
   private java.math.BigDecimal AV142facim1 ;
   private java.math.BigDecimal AV143facimp ;
   private java.math.BigDecimal AV151implinea ;
   private String A396EmprCod ;
   private String scmdbuf ;
   private String A450FacPri ;
   private java.util.Date AV52Fec1 ;
   private java.util.Date AV53Fec2 ;
   private java.util.Date A436FacFch ;
   private boolean returnInSub ;
   private java.math.BigDecimal[] aP6 ;
   private java.math.BigDecimal[] aP5 ;
   private IDataStoreProvider pr_default ;
   private String[] P0A5L2_A396EmprCod ;
   private String[] P0A5L2_A450FacPri ;
   private int[] P0A5L2_A430FacCod ;
   private java.util.Date[] P0A5L2_A436FacFch ;
   private byte[] P0A5L2_A1153FacTipFac ;
   private java.math.BigDecimal[] P0A5L2_A9646FacTot1 ;
   private String[] P0A5L3_A396EmprCod ;
   private int[] P0A5L3_A430FacCod ;
   private java.math.BigDecimal[] P0A5L3_A5353FacImpMan ;
   private int[] P0A5L3_A12197FacUnds ;
   private java.math.BigDecimal[] P0A5L3_A12198FacPreUnd ;
   private java.math.BigDecimal[] P0A5L3_A447FacMts ;
   private java.math.BigDecimal[] P0A5L3_A449FacPreMts ;
   private java.math.BigDecimal[] P0A5L3_A444FacKgs ;
   private java.math.BigDecimal[] P0A5L3_A448FacPreKgs ;
   private byte[] P0A5L3_A428FacAlbTip ;
   private java.math.BigDecimal[] P0A5L3_A3897FacKgsA ;
   private java.math.BigDecimal[] P0A5L3_A9649FacPKDto ;
   private java.math.BigDecimal[] P0A5L3_A3898FacPreKgsA ;
   private java.math.BigDecimal[] P0A5L3_A9650FacPMdto ;
   private int[] P0A5L3_A446FacLin ;
   private String[] P0A5L4_A396EmprCod ;
   private int[] P0A5L4_A430FacCod ;
   private int[] P0A5L4_A12197FacUnds ;
   private java.math.BigDecimal[] P0A5L4_A447FacMts ;
   private java.math.BigDecimal[] P0A5L4_A444FacKgs ;
   private byte[] P0A5L4_A428FacAlbTip ;
   private java.math.BigDecimal[] P0A5L4_A9649FacPKDto ;
   private java.math.BigDecimal[] P0A5L4_A9650FacPMdto ;
   private java.math.BigDecimal[] P0A5L4_A449FacPreMts ;
   private java.math.BigDecimal[] P0A5L4_A448FacPreKgs ;
   private int[] P0A5L4_A446FacLin ;
}

final  class ptcreditdebit__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("P0A5L2", "SELECT EmprCod, FacPri, FacCod, FacFch, FacTipFac, FacTot1 FROM TXPCFAVEN WHERE (EmprCod = ? and FacFch >= ? and FacCod >= ?) AND (FacCod <= ?) AND (FacPri = '1') AND (FacFch <= ?) ORDER BY EmprCod, FacFch, FacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A5L3", "SELECT EmprCod, FacCod, FacImpMan, FacUnds, FacPreUnd, FacMts, FacPreMts, FacKgs, FacPreKgs, FacAlbTip, FacKgsA, FacPKDto, FacPreKgsA, FacPMdto, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("P0A5L4", "SELECT EmprCod, FacCod, FacUnds, FacMts, FacKgs, FacAlbTip, FacPKDto, FacPMdto, FacPreMts, FacPreKgs, FacLin FROM TXPLFAVEN WHERE EmprCod = ? and FacCod = ? ORDER BY EmprCod, FacCod, FacLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,2);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,5);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,5);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,5);
               ((int[]) buf[14])[0] = rslt.getInt(15);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((java.math.BigDecimal[]) buf[4])[0] = rslt.getBigDecimal(5,2);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,5);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((int[]) buf[10])[0] = rslt.getInt(11);
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
               stmt.setDate(2, (java.util.Date)parms[1]);
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setDate(5, (java.util.Date)parms[4]);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

