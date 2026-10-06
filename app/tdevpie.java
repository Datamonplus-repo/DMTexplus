package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tdevpie", "/app.tdevpie"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tdevpie extends GXWebObjectStub
{
   public tdevpie( )
   {
   }

   public tdevpie( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tdevpie.class ));
   }

   public tdevpie( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tdevpie_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tdevpie_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Devolucion Genero por Pieza";
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

