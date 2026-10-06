package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tprmqfa", "/app.tprmqfa"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tprmqfa extends GXWebObjectStub
{
   public tprmqfa( )
   {
   }

   public tprmqfa( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tprmqfa.class ));
   }

   public tprmqfa( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tprmqfa_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tprmqfa_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "PARAMETROS FASE-MAQUINA-ANCHO";
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

