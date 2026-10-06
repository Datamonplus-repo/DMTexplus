package app.calidad ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidad.wwanalisercncexcel", "/app.calidad.wwanalisercncexcel"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwanalisercncexcel extends GXWebObjectStub
{
   public wwanalisercncexcel( )
   {
   }

   public wwanalisercncexcel( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwanalisercncexcel.class ));
   }

   public wwanalisercncexcel( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwanalisercncexcel_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwanalisercncexcel_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Reclamaciones y no conformidades - Analise RC e NC Excel";
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

