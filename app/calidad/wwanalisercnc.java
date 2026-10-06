package app.calidad ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidad.wwanalisercnc", "/app.calidad.wwanalisercnc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwanalisercnc extends GXWebObjectStub
{
   public wwanalisercnc( )
   {
   }

   public wwanalisercnc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwanalisercnc.class ));
   }

   public wwanalisercnc( int remoteHandle ,
                         ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwanalisercnc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwanalisercnc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Reclamaciones y no conformidades - Analise RC e NC";
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

