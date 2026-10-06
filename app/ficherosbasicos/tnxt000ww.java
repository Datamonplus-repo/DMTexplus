package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.ficherosbasicos.tnxt000ww", "/app.ficherosbasicos.tnxt000ww"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tnxt000ww extends GXWebObjectStub
{
   public tnxt000ww( )
   {
   }

   public tnxt000ww( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tnxt000ww.class ));
   }

   public tnxt000ww( int remoteHandle ,
                     ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tnxt000ww_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tnxt000ww_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return " Componentes";
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

