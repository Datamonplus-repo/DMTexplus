package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mrec_analisisdetalle", "/app.ingenieria.mrec_analisisdetalle"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrec_analisisdetalle extends GXWebObjectStub
{
   public mrec_analisisdetalle( )
   {
   }

   public mrec_analisisdetalle( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrec_analisisdetalle.class ));
   }

   public mrec_analisisdetalle( int remoteHandle ,
                                ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrec_analisisdetalle_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrec_analisisdetalle_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "MRec_Analisis Detalle";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

   protected String EncryptURLParameters( )
   {
      return "NO";
   }

}

