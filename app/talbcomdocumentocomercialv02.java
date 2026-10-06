package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.talbcomdocumentocomercialv02", "/app.talbcomdocumentocomercialv02"})
@jakarta.servlet.annotation.MultipartConfig
public final  class talbcomdocumentocomercialv02 extends GXWebObjectStub
{
   public talbcomdocumentocomercialv02( )
   {
   }

   public talbcomdocumentocomercialv02( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( talbcomdocumentocomercialv02.class ));
   }

   public talbcomdocumentocomercialv02( int remoteHandle ,
                                        ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new talbcomdocumentocomercialv02_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new talbcomdocumentocomercialv02_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "TALBCOMDocumento Comercialv02";
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

