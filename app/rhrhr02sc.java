package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rhrhr02sc", "/app.rhrhr02sc"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rhrhr02sc extends GXWebObjectStub
{
   public rhrhr02sc( )
   {
   }

   public rhrhr02sc( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rhrhr02sc.class ));
   }

   public rhrhr02sc( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rhrhr02sc_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rhrhr02sc_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO RECETAS SIN COSTES";
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

