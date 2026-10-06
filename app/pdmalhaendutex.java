package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.pdmalhaendutex", "/app.pdmalhaendutex"})
@jakarta.servlet.annotation.MultipartConfig
public final  class pdmalhaendutex extends GXWebObjectStub
{
   public pdmalhaendutex( )
   {
   }

   public pdmalhaendutex( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( pdmalhaendutex.class ));
   }

   public pdmalhaendutex( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new pdmalhaendutex_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new pdmalhaendutex_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Guia Transporte Devolucion Malha em Cru";
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

