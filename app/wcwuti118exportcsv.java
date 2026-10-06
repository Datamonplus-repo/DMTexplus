package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@jakarta.servlet.annotation.WebServlet(urlPatterns = {"/servlet/app.wcwuti118exportcsv", "/app.wcwuti118exportcsv"})
@jakarta.servlet.annotation.MultipartConfig
public final  class wcwuti118exportcsv extends GXWebObjectStub
{
   public wcwuti118exportcsv( )
   {
   }

   public wcwuti118exportcsv( int remoteHandle )
   {
      super(remoteHandle, new ModelContext( wcwuti118exportcsv.class ));
   }

   public wcwuti118exportcsv( int remoteHandle ,
                              ModelContext context )
   {
      super(remoteHandle, context);
   }

   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new wcwuti118exportcsv_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new wcwuti118exportcsv_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "WCWUti118 Export CSV";
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

