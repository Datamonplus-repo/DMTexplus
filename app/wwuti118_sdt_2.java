package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wwuti118_sdt_2", "/app.wwuti118_sdt_2"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wwuti118_sdt_2 extends GXWebObjectStub
{
   public wwuti118_sdt_2( )
   {
   }

   public wwuti118_sdt_2( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wwuti118_sdt_2.class ));
   }

   public wwuti118_sdt_2( int remoteHandle ,
                          ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wwuti118_sdt_2_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wwuti118_sdt_2_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Informe Compras, Consumos";
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

