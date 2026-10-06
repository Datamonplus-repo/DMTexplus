package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.trabajosexternos.rexpr90", "/app.trabajosexternos.rexpr90"})
@jakarta.servlet.annotation.MultipartConfig
public final  class rexpr90 extends GXWebObjectStub
{
   public rexpr90( )
   {
   }

   public rexpr90( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( rexpr90.class ));
   }

   public rexpr90( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new rexpr90_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new rexpr90_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "INFORME TRABAJO EXTERNOS RECEPCION";
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

