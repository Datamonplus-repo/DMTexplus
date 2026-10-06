package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.tpedata", "/app.tpedata"})
@jakarta.servlet.annotation.MultipartConfig
public final  class tpedata extends GXWebObjectStub
{
   public tpedata( )
   {
   }

   public tpedata( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( tpedata.class ));
   }

   public tpedata( int remoteHandle ,
                   ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new tpedata_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new tpedata_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Agrupacion para Tintar";
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

