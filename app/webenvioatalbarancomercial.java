package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.webenvioatalbarancomercial", "/app.webenvioatalbarancomercial"})
@jakarta.servlet.annotation.MultipartConfig
public final  class webenvioatalbarancomercial extends GXWebObjectStub
{
   public webenvioatalbarancomercial( )
   {
   }

   public webenvioatalbarancomercial( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( webenvioatalbarancomercial.class ));
   }

   public webenvioatalbarancomercial( int remoteHandle ,
                                      ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new webenvioatalbarancomercial_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new webenvioatalbarancomercial_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Envio Albaran Comercial";
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

