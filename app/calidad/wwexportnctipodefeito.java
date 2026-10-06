package app.calidad ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.calidad.wwexportnctipodefeito", "/app.calidad.wwexportnctipodefeito"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwexportnctipodefeito extends GXWebObjectStub
{
   public wwexportnctipodefeito( )
   {
   }

   public wwexportnctipodefeito( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwexportnctipodefeito.class ));
   }

   public wwexportnctipodefeito( int remoteHandle ,
                                 ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwexportnctipodefeito_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwexportnctipodefeito_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "NC Tipo defeito";
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

