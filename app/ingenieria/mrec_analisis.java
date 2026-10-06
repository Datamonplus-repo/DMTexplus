package app.ingenieria ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ingenieria.mrec_analisis", "/app.ingenieria.mrec_analisis"})
@jakarta.servlet.annotation.MultipartConfig
public final  class mrec_analisis extends GXWebObjectStub
{
   public mrec_analisis( )
   {
   }

   public mrec_analisis( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( mrec_analisis.class ));
   }

   public mrec_analisis( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new mrec_analisis_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new mrec_analisis_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Análisis";
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

