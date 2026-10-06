package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.rhrhr02", "/app.rhrhr02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rhrhr02 extends GXWebObjectStub
{
   public rhrhr02( )
   {
   }

   public rhrhr02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rhrhr02.class ));
   }

   public rhrhr02( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rhrhr02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rhrhr02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "HISTORICO RECETAS,COSTES";
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

